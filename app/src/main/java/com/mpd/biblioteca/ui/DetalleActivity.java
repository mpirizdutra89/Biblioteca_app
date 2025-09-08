package com.mpd.biblioteca.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.mpd.biblioteca.R;
import com.mpd.biblioteca.databinding.ActivityDetalleBinding;
import com.mpd.biblioteca.modelo.InputValidator;
import com.mpd.biblioteca.ui.viewModel.DetalleViewModel;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding detalleBinding;
    private DetalleViewModel detalleViewModel;
    private static final String TAG = "mensajes_app:"; // Etiqueta para filtrar en Logcat

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Configuracion Binding
         * */
        detalleBinding=ActivityDetalleBinding.inflate(getLayoutInflater());
        detalleViewModel=new ViewModelProvider(this).get(DetalleViewModel.class);

        setContentView(detalleBinding.getRoot());

        EdgeToEdge.enable(this);

// Usar la vista raíz de tu binding directamente
        ViewCompat.setOnApplyWindowInsetsListener(detalleBinding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        detalleViewModel.getmLibro().observe(this,Libro->{
            detalleBinding.tvTituloLibro.setText(Libro.getTitulo());
            detalleBinding.tvAutor.setText(Libro.getAutor());
            String generos= InputValidator.recorrerConcatenar(Libro.getGenero());
            Log.d(TAG,"Generos: "+generos);
            detalleBinding.tvGenero.setText(generos);
            detalleBinding.tvDetalle.setText(Libro.getDetalle());
        });
        detalleViewModel.cargarDatosObjeto(getIntent());
        /** Boton volver **/
       detalleBinding.btnVolver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

    }
}
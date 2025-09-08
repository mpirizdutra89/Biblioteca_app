package com.mpd.biblioteca.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.mpd.biblioteca.R;
import com.mpd.biblioteca.databinding.ActivityDetalleBinding;
import com.mpd.biblioteca.ui.viewModel.DetalleViewModel;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding detalleBinding;
    private DetalleViewModel detalleViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Configuracion Binding
         * */
        detalleBinding=ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(detalleBinding.getRoot());

        EdgeToEdge.enable(this);

// Usar la vista raíz de tu binding directamente
        ViewCompat.setOnApplyWindowInsetsListener(detalleBinding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        /**
         *Configuracion ViewModel Detalle
         * Anexamos la logica a la vista con observer y la llamada de metodos
         * */
        detalleViewModel=new ViewModelProvider(this).get(DetalleViewModel.class);

        /**
         * Observer
         * **/
    }
}
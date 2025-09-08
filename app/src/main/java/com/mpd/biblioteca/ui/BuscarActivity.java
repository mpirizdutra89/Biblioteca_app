package com.mpd.biblioteca.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mpd.biblioteca.R;
import com.mpd.biblioteca.databinding.ActivityMainBinding;
import com.mpd.biblioteca.modelo.InputValidator;
import com.mpd.biblioteca.ui.viewModel.BuscarViewModel;

public class BuscarActivity extends AppCompatActivity {
    private ActivityMainBinding buscarBinding;
    private BuscarViewModel buscarViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buscarBinding=ActivityMainBinding.inflate(getLayoutInflater());
        buscarViewModel=new ViewModelProvider(this).get(BuscarViewModel.class);
        setContentView(buscarBinding.getRoot());

        //observable del msj
        buscarViewModel.getmMsj().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                buscarBinding.tvMensaje.setText(s);
            }
        });

        //observable del libro que se busca
        buscarViewModel.getmLibro().observe(this,Libro->{
            Intent intent=new Intent(this,DetalleActivity.class);
            intent.putExtra("libro",Libro);
            startActivity(intent);
        });

        //evento
        buscarBinding.btnBuscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(InputValidator.isValidInput(buscarBinding.etBuscar)){
                    buscarViewModel.BuscarLibro(buscarBinding.etBuscar.getText().toString());
                }
            }
        });

//        Intent intent = new Intent(this, DetalleActivity.class);
//
//
//        startActivity(intent);




    }
}
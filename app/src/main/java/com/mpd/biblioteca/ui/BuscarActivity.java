package com.mpd.biblioteca.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.mpd.biblioteca.R;
import com.mpd.biblioteca.databinding.ActivityMainBinding;
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



    }
}
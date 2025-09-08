package com.mpd.biblioteca.ui.viewModel;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mpd.biblioteca.modelo.Libro;

public class DetalleViewModel extends AndroidViewModel {
    private MutableLiveData mLibro;
    public DetalleViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getmLibro(){
        if(mLibro==null){
            mLibro=new MutableLiveData<>();
        }
        return  mLibro;
    }

    public void cargarDatosObjeto(Intent intent){
        Libro libro=(Libro) intent.getSerializableExtra("libro");
        if(libro!=null){
            mLibro.setValue(libro);
        }
    }

}

package com.mpd.biblioteca.ui.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mpd.biblioteca.modelo.InputValidator;
import com.mpd.biblioteca.modelo.Libro;
import com.mpd.biblioteca.repositorio.RepoLibros;

public class BuscarViewModel extends AndroidViewModel {
    private MutableLiveData mLibro;
    private MutableLiveData mMsj;
    private  RepoLibros repo;
    public BuscarViewModel(@NonNull Application application) {
        super(application);
        repo=new RepoLibros();
    }

    public LiveData<String> getmMsj(){
        if(mMsj==null){
            mMsj=new MutableLiveData();
        }
        return  mMsj;
    }

    public LiveData<Libro> getmLibro(){
        if(mLibro==null) {
            mLibro = new MutableLiveData();
        }
        return  mLibro;
    }

    public void BuscarLibro(String busqueda){
       Libro libro= repo.buscarLibroEstricto(busqueda);
       if(libro==null){
           mMsj.setValue("No hay resultados");
       }else{
           mLibro.setValue(libro);
       }
    }


}

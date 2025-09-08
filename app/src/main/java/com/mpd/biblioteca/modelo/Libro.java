package com.mpd.biblioteca.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

public class Libro   implements Serializable {
    private String titulo;
    private String autor;
    private String detalle;
    private Set<GeneroEnum> genero;

    public Libro(String titulo, String autor, String detalle, Set<GeneroEnum>  genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.detalle = detalle;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Set<GeneroEnum> getGenero() {
        return genero;
    }

    public void setGenero(Set<GeneroEnum> genero) {
        this.genero = genero;
    }
}

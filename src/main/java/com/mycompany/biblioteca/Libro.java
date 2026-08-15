package com.mycompany.biblioteca;

public class Libro extends Material {
    private String autor;
    private String editorial;

    public Libro(String codigo, String titulo, String autor, String editorial) {
        super(codigo, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

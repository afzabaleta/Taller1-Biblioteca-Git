package com.mycompany.biblioteca;

public class Material {
    protected String codigo;
    protected String titulo;

    public Material(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Material{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

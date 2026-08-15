package com.mycompany.biblioteca;

public class Prestamo {
    private Cliente cliente;
    private Libro libro;

    public Prestamo(Libro libro, Cliente cliente) {
        this.libro = libro;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "cliente=" + cliente +
                ", libro=" + libro +
                '}';
    }
}

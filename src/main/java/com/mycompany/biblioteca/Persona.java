package com.mycompany.biblioteca;

public class Persona {
    protected String id;
    protected String nombre;
    protected String telefono;

    public Persona(String id, String telefono, String nombre) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id: '" + id + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", telefono: '" + telefono + '\'' +
                '}';
    }
}

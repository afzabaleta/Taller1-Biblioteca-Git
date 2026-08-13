package com.mycompany.biblioteca;

public class Cliente {
    private String email;

    public Cliente(String id, String telefono, String nombre, String email) {
        super(id, telefono, nombre);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                '}';
    }
}

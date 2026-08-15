package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }

    static void crearCliente() {
        System.out.println("    Crear Cliente    ");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente c = new Cliente(id, nombre, telefono, email);
        clientes.add(c);
        System.out.println("Cliente creado con éxito.");
    }

    static void listarClientes() {
        System.out.println("    Lista de Clientes    ");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public static void buscarCliente() {
        System.out.println("    BUSCAR CLIENTE    ");

        System.out.print("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente);
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void actualizarcliente(){
        System.out.println("    ACTUALIZAR CLEINTE    ");

        System.out.println("Ingrese le ID del cliente: ");
        String id = sc.nextLine();

        for (Cliente cliente : clientes){
            if (cliente.getId().equals(id)){

                System.out.println("Ingrese el nuevo nombre: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese el nuevo telefono: ");
                String telefono = sc.nextLine();

                System.out.println("Ingrese el nuevo email: ");
                String email = sc.nextLine();

                cliente.setNombre(nombre);
                cliente.setTelefono(telefono);
                cliente.setEmail(email);

                System.out.println("Cliente actualizado correctamente.");
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void eliminarcliente(){
        System.out.println("    ELIMINAR CLIENTE    ");

        System.out.println("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getId().equals(id)){
                clientes.remove(i);
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
            System.out.println("Cliente no encontrado.");
        }
    }

}
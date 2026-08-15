package com.mycompany.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    static ArrayList<Libro>libros = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
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
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void crearLibro(){
        System.out.println("    CREAR LIBRO    ");

        System.out.println("Codigo: ");
        String codigo = sc.nextLine();

        System.out.println("Titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Año de publicacion: ");
        String anioPublicacion = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        System.out.println("Disponible (true/false): ");
        boolean disponible = Boolean.parseBoolean(sc.nextLine());

        Libro libro = new Libro(codigo, titulo, anioPublicacion, autor, disponible);
        libros.add(libro);

        System.out.println("Libro creado con éxito.");
    }

    public static void listarLibros() {
        System.out.println("    LISTAR LIBROS    ");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados. ");
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public static void buscarLibros(){
        System.out.println("    BUSCAR LIBROS    ");

        System.out.println("Ingrese el codigo del libro: ");
        String codigo = sc.nextLine();

        for (Libro libro : libros){
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("Libro encontrado:");
                System.out.println(libro);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void actualizarLibros(){
        System.out.println("    ACTUALIZAR LIBROS    ");
        System.out.println("Ingrese el codigo del libro: ");
        String codigo = sc.nextLine();

        for (Libro libro : libros){
            if (libro.getCodigo().equals(codigo)){

                System.out.println("Ingrese el nuevo titulo: ");
                String titulo = sc.nextLine();

                System.out.println("Ingrese el nuevo año de publicacion: ");
                String anioPublicacion = sc.nextLine();

                System.out.println("Ingrese el nuevo autor: ");
                String autor = sc.nextLine();

                System.out.println("Ingrese si el libro esta disponible (true/false): ");
                boolean disponible = Boolean.parseBoolean(sc.nextLine());

                libro.setTitulo(titulo);
                libro.setAnioPublicacion(anioPublicacion);
                libro.setAutor(autor);
                libro.setDisponible(disponible);

                System.out.println("Libro actualizado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void eliminarLibros(){
        System.out.println("    ELIMINAR LIBROS    ");
        System.out.println("Ingrese el codigo del libro: ");
        String codigo = sc.nextLine();

        for (int i = 0; i < libros.size(); i++){
            if (libros.get(i).getCodigo().equals(codigo)){
                libros.remove(i);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void crearPrestamo(){
        System.out.println("    REGISTRO PRESTAMO    ");

        System.out.println("Ingrese el ID del Prestamo. ");
        String idPrestamo = sc.nextLine();
        System.out.println("Ingrese le ID del Cliente: ");
        String idCliente = sc.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes){
            if (cliente.getId().equals(idCliente)){
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null){
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Ingrese el codigo del libro: ");
        String codigoLibro = sc.nextLine();

        Libro libroEncontrado = null;

        for (Libro libro : libros){
            if (libro.getCodigo().equals(codigoLibro)){
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado == null){
            System.out.println("Libro no encontrado.");
            return;
        }

        if (!libroEncontrado.isDisponible()){
            System.out.println("El libro no esta disponible.");
            return;
        }

        LocalDate fecha = LocalDate.now();
        String estado = "PRESTADO";

        Prestamo prestamo = new Prestamo(
                idPrestamo,
                clienteEncontrado,
                libroEncontrado,
                fecha,
                estado
        );

        prestamos.add(prestamo);
        libroEncontrado.setDisponible(false);
        System.out.println("Prestamo registrado correctamente. ");

    }

    public static void devolucion(){
        System.out.println("    DEVOLUCION DE PRESTAMO    ");

        System.out.println("Ingrese el ID del prestamo: ");
        String idPrestamo = sc.nextLine();

        for (Prestamo prestamo : prestamos){
            if (prestamo.getIdPrestamo().equals(idPrestamo)){
                prestamo.setEstado("DEVUELTO");
                prestamo.getLibro().setDisponible(true);

                System.out.println("Prestamo devuelto correctamente.");
            }
        }
        System.out.println("Prestamo no encontrado.");
    }

    public static void listarPrestamos() {
        System.out.println("    LISTAR PRESTAMO    ");
        if (prestamos.isEmpty()) {
            System.out.println("No hay prestamos registrados. ");
            return;
        }
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

}
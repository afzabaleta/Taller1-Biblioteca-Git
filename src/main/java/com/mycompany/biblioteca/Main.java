package com.mycompany.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n      SISTEMA DE GESTION DE BIBLIOTECA      ");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Libros");
            System.out.println("3. Gestion de Prestamos");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option){

                case 1:
                    int clientOption;

                    do {
                        System.out.println("\n      GESTION CLIENTES      ");
                        System.out.println("1. Crear Cliente");
                        System.out.println("2. Listar Cliente");
                        System.out.println("3. Buscar Cliente");
                        System.out.println("4. Actualizar Cliente");
                        System.out.println("5. Eliminar Cliente");
                        System.out.println("6. volver");
                        System.out.println("Seleccione una opcion: ");

                        clientOption = Integer.parseInt(sc.nextLine());

                        switch (clientOption){
                            case 1:
                                createClient();
                                break;
                            case 2:
                                listClients();
                                break;
                            case 3:
                                findClient();
                                break;
                            case 4:
                                updateClient();
                                break;
                            case 5:
                                deleteClient();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                    } while (clientOption != 6);
                    break;

                case 2:
                    int bookOption;

                    do {
                        System.out.println("\n      GESTION DE LIBROS      ");
                        System.out.println("1. Crear libro");
                        System.out.println("2. Listar libro");
                        System.out.println("3. Buscar libro");
                        System.out.println("4. Actualizar libro");
                        System.out.println("5. Eliminar libro");
                        System.out.println("6. Salir");
                        System.out.println("Selecciones un opcion: ");

                        bookOption = Integer.parseInt(sc.nextLine());

                        switch (bookOption) {
                            case 1:
                                createBook();
                                break;
                            case 2:
                                listBooks();
                                break;
                            case 3:
                                findBook();
                                break;
                            case 4:
                                updateBook();
                                break;
                            case 5:
                                deleteBook();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }
                    } while (bookOption != 6);
                    break;

                case 3:
                    int loanOption;

                    do {
                        System.out.println("\n      GESTION DE PRESTAMOS      ");
                        System.out.println("1. Registrar Prestamo");
                        System.out.println("2. Devolver Prestamo");
                        System.out.println("3. Listar Prestamo");
                        System.out.println("4. Salir");
                        System.out.println("Seleccione una opcion: ");

                        loanOption = Integer.parseInt(sc.nextLine());

                        switch (loanOption){
                            case 1:
                                createLoan();
                                break;
                            case 2:
                                returnLoan();
                                break;
                            case 3:
                                listLoans();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                        }

                    } while (loanOption != 4);
                    break;

                case 4:
                    break;
                default:
                    System.out.println("SALIENDO DEL SISTEMA....");
            }
        } while (option != 4);

        sc.close();
    }

    static void createClient() {
        System.out.println("    Crear Cliente    ");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Teléfono: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Client c = new Client(id, phone, name, email);
        clients.add(c);
        System.out.println("Cliente creado con éxito.");

    }

    static void listClients() {
        System.out.println("    Lista de Clientes    ");
        if (clients.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Client c : clients) {
            System.out.println(c);
        }
    }

    public static void findClient() {
        System.out.println("    BUSCAR CLIENTE    ");

        System.out.print("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (Client client : clients) {
            if (client.getId().equals(id)) {
                System.out.println("Cliente encontrado:");
                System.out.println(client);
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void updateClient(){
        System.out.println("    ACTUALIZAR CLEINTE    ");

        System.out.println("Ingrese le ID del cliente: ");
        String id = sc.nextLine();

        for (Client client : clients){
            if (client.getId().equals(id)){

                System.out.println("Ingrese el nuevo nombre: ");
                String name = sc.nextLine();

                System.out.println("Ingrese el nuevo telefono: ");
                String phone = sc.nextLine();

                System.out.println("Ingrese el nuevo email: ");
                String email = sc.nextLine();

                client.setName(name);
                client.setPhone(phone);
                client.setEmail(email);

                System.out.println("Cliente actualizado correctamente.");
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void deleteClient(){
        System.out.println("    ELIMINAR CLIENTE    ");

        System.out.println("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (int i = 0; i < clients.size(); i++){
            if (clients.get(i).getId().equals(id)){
                clients.remove(i);
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void createBook(){
        System.out.println("    CREAR LIBRO    ");

        System.out.println("Codigo: ");
        String code = sc.nextLine();

        System.out.println("Titulo: ");
        String title = sc.nextLine();

        System.out.println("Año de publicacion: ");
        String publicationYear = sc.nextLine();

        System.out.println("Autor: ");
        String author = sc.nextLine();

        System.out.println("Disponible (true/false): ");
        boolean available = Boolean.parseBoolean(sc.nextLine());

        Book book = new Book(code, title, publicationYear, author, available);
        books.add(book);

        System.out.println("Libro creado con éxito.");
    }

    public static void listBooks() {
        System.out.println("    LISTAR LIBROS    ");
        if (books.isEmpty()) {
            System.out.println("No hay libros registrados. ");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void findBook(){
        System.out.println("    BUSCAR LIBROS    ");

        System.out.println("Ingrese el codigo del libro: ");
        String code = sc.nextLine();

        for (Book book : books){
            if (book.getCode().equals(code)) {
                System.out.println("Libro encontrado:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void updateBook(){
        System.out.println("    ACTUALIZAR LIBROS    ");
        System.out.println("Ingrese el codigo del libro: ");
        String code = sc.nextLine();

        for (Book book : books){
            if (book.getCode().equals(code)){

                System.out.println("Ingrese el nuevo titulo: ");
                String title = sc.nextLine();

                System.out.println("Ingrese el nuevo año de publicacion: ");
                String publicationYear = sc.nextLine();

                System.out.println("Ingrese el nuevo autor: ");
                String author = sc.nextLine();

                System.out.println("Ingrese si el libro esta disponible (true/false): ");
                boolean available = Boolean.parseBoolean(sc.nextLine());

                book.setTitle(title);
                book.setPublicationYear(publicationYear);
                book.setAuthor(author);
                book.setAvailable(available);

                System.out.println("Libro actualizado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void deleteBook(){
        System.out.println("    ELIMINAR LIBROS    ");
        System.out.println("Ingrese el codigo del libro: ");
        String code = sc.nextLine();

        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getCode().equals(code)){
                books.remove(i);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public static void createLoan(){
        System.out.println("    REGISTRO PRESTAMO    ");

        System.out.println("Ingrese el ID del Prestamo. ");
        String loanId = sc.nextLine();

        System.out.println("Ingrese le ID del Cliente: ");
        String clientId = sc.nextLine();

        Client clientFound = null;

        for (Client client : clients){
            if (client.getId().equals(clientId)){
                clientFound = client;
                break;
            }
        }

        if (clientFound == null){
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Ingrese el codigo del libro: ");
        String bookCode = sc.nextLine();

        Book bookFound = null;

        for (Book book : books){
            if (book.getCode().equals(bookCode)){
                bookFound = book;
                break;
            }
        }

        if (bookFound == null){
            System.out.println("Libro no encontrado.");
            return;
        }

        if (!bookFound.isAvailable()){
            System.out.println("El libro no esta disponible.");
            return;
        }

        LocalDate date = LocalDate.now();
        String status = "PRESTADO";

        Loan loan = new Loan(
                loanId,
                clientFound,
                bookFound,
                date,
                status
        );

        loans.add(loan);
        bookFound.setAvailable(false);
        System.out.println("Prestamo registrado correctamente. ");

    }

    public static void returnLoan(){
        System.out.println("    DEVOLUCION DE PRESTAMO    ");

        System.out.println("Ingrese el ID del prestamo: ");
        String loanId = sc.nextLine();

        for (Loan loan : loans){
            if (loan.getLoanId().equals(loanId)){
                loan.setStatus("DEVUELTO");
                loan.getBook().setAvailable(true);

                System.out.println("Prestamo devuelto correctamente.");
                return;
            }
        }
        System.out.println("Prestamo no encontrado.");
    }

    public static void listLoans() {
        System.out.println("    LISTAR PRESTAMO    ");
        if (loans.isEmpty()) {
            System.out.println("No hay prestamos registrados. ");
            return;
        }
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
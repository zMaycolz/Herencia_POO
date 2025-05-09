package principal;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Ejecutor {
    public static Date leerFecha(String fechaTexto) {
        String[] partes = fechaTexto.split("-");
        int anio = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1; // Enero es 0
        int dia = Integer.parseInt(partes[2]);

        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes, dia);

        return calendario.getTime();
    }

    public static void main(String[] args) {
        Scanner Administrador = new Scanner(System.in);

        List<Libro> listaLibro = new ArrayList<Libro>();
        List<Prestamo> listaPrestamo = new ArrayList<Prestamo>();
        List<Cliente> listaCliente = new ArrayList<Cliente>();

        System.out.println("---------------REGISTRAR CLIENTE:---------------");
        System.out.print("ID del Usuario: ");
        int idCliente = Integer.parseInt(Administrador.nextLine());
        System.out.print("Ingrese el Nombre: ")   ;
        String nombreCliente = Administrador.nextLine();
        System.out.print("Ingrese el Correo: ");
        String correoCliente = Administrador.nextLine();
        Cliente cliente = new Cliente(idCliente, nombreCliente, correoCliente);
        listaCliente.add(cliente);

        System.out.println("------------REGISTRAR LIBRO-------------------");
        System.out.print("Ingrese el isbn: ");
        String isbnLibro = Administrador.nextLine();
        System.out.print("Ingrese el Titulo: ");
        String tituloLibro = Administrador.nextLine();
        System.out.print("Ingrese el Autor: ");
        String autorLibro = Administrador.nextLine();
        System.out.print("¿Libro disponible? (si/no): ");
        String disponibleTexto = Administrador.nextLine().trim().toLowerCase();
        boolean libroDisponible = disponibleTexto.equals("si") || disponibleTexto.equals("sí") ||
                disponibleTexto.equals("true");

        Libro libro = new Libro(isbnLibro, tituloLibro, autorLibro, libroDisponible);
        listaLibro.add(libro);

        System.out.println("-------------REALIZAR PRESTAMO----------------");
        System.out.print("Fecha de inicio (dd/mm/yyyy) ");
        Date fechaPrestamo = leerFecha(Administrador.nextLine());
        System.out.print("Fecha de Devolucion (dd/mm/yyyy)" );
        Date fechaDePrestamo = leerFecha(Administrador.nextLine());
        System.out.print("Estado del libro: ");
        String estadoPrestamo = Administrador.nextLine();
        Prestamo prestamo =new Prestamo(fechaPrestamo, fechaDePrestamo, estadoPrestamo);
        listaPrestamo.add(prestamo);

        System.out.println("____Registro Completo A Continuacion:____");
        System.out.println("Cliente resgistrado: " + cliente);
        System.out.println("Libro Registrado: " + libro);
        System.out.println("Prestamo realizado: " + prestamo);


    }

}

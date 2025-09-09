package TP4.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCategorias lista = new ListaCategorias();

        // Cargar empleados
        while (true) {
            System.out.print("Apellido y nombre (XX para terminar): ");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("XX")) break;

            System.out.print("Categoría (letra): ");
            char cat = sc.nextLine().charAt(0);

            System.out.print("Sueldo: ");
            double sueldo = Double.parseDouble(sc.nextLine());

            Empleado e = new Empleado(nombre, cat, sueldo);
            lista.agregarEmpleado(e);
        }

        // Consultar categoría
        System.out.print("Ingrese categoría a mostrar: ");
        char buscar = sc.nextLine().charAt(0);
        lista.mostrarCategoria(buscar);

        sc.close();
    }
}


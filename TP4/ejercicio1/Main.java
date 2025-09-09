package TP4.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- MENÚ LISTA CIRCULAR ---");
            System.out.println("1. Insertar un elemento");
            System.out.println("2. Eliminar un elemento");
            System.out.println("3. Mostrar la lista");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el valor a insertar: ");
                int valor = sc.nextInt();
                lista.insertar(valor);

            } else if (opcion == 2) {
                System.out.print("Ingrese el valor a eliminar: ");
                int valor = sc.nextInt();
                lista.eliminar(valor);

            } else if (opcion == 3) {
                lista.mostrar();

            } else if (opcion == 0) {
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}

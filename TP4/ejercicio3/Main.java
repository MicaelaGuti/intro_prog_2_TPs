package TP4.ejercicio3;

public class Main {
    public static void main(String[] args) {
        FilaDeEnteros fila = new FilaDeEnteros();

        fila.agregar(10);
        fila.agregar(20);
        fila.agregar(30);

        fila.escribirFila(); 

        System.out.println("Primero: " + fila.verPrimero()); 

        System.out.println("Extraído: " + fila.extraer()); 
        fila.escribirFila(); 
    }
}

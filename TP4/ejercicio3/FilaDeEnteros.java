package TP4.ejercicio3;
import TP4.ejercicio1.Nodo; 

public class FilaDeEnteros {
    
        private Nodo frente;  
        private Nodo fin;     
    
       
        public FilaDeEnteros() {
            frente = null;
            fin = null;
        }
    
        // Método para verificar si la fila está vacía
        public boolean filaVacia() {
            return frente == null;
        }
    
        // Agregar un elemento al final de la fila
        public void agregar(int valor) {
            Nodo nuevo = new Nodo(valor);
            if (filaVacia()) {
                frente = nuevo;
                fin = nuevo;
            } else {
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }
        }
    
        // Extraer el primer elemento de la fila
        public int extraer() {
            if (filaVacia()) {
                throw new RuntimeException("La fila está vacía, no se puede extraer.");
            }
            int valor = frente.getDato();
            frente = frente.getSiguiente();
            if (frente == null) {
                fin = null;
            }
            return valor;
        }
    
        // Ver el primer elemento sin extraerlo
        public int verPrimero() {
            if (filaVacia()) {
                throw new RuntimeException("La fila está vacía.");
            }
            return frente.getDato();
        }
    
        // Escribir todos los elementos de la fila
        public void escribirFila() {
            if (filaVacia()) {
                System.out.println("La fila está vacía.");
                return;
            }
            Nodo actual = frente;
            System.out.print("Fila: ");
            while (actual != null) {
                System.out.print(actual.getDato() + " ");
                actual = actual.getSiguiente();
            }
            System.out.println();
        }
    
}

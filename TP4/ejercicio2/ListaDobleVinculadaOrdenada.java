package TP4.ejercicio2;

public class ListaDobleVinculadaOrdenada {
    private Nodo inicio;
    private Nodo fin;

    public ListaDobleVinculadaOrdenada() {
        this.inicio = null;
        this.fin = null;
    }

    // Insertar en orden ascendente
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) { 
            inicio = fin = nuevo;
        } else if (dato < inicio.dato) { 
            inicio.anterior = nuevo;
            inicio = nuevo;
        } else if (dato >= fin.dato) { 
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        } else { 
            Nodo actual = inicio;
            while (actual != null && actual.dato < dato) {
                actual = actual.siguiente;
            }
            
            Nodo anterior = actual.anterior;
            anterior.siguiente = nuevo;
            nuevo.anterior = anterior;
            nuevo.siguiente = actual;
            actual.anterior = nuevo;
        }
    }

    // Eliminar un elemento
    public void eliminar(int dato) {
        if (inicio == null) {
            return;
        }

        Nodo actual = inicio;
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            return;
        }

        if (actual == inicio && actual == fin) { 
            inicio = fin = null;
        } else if (actual == inicio) { 
            inicio = inicio.siguiente;
            inicio.anterior = null;
        } else if (actual == fin) { 
            fin = fin.anterior;
            fin.siguiente = null;
        } else { 
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        System.out.println("Elemento " + dato + " eliminado.");
    }

    // Recorrer desde el inicio
    public void recorrerDesdeInicio() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Recorrer desde el final
    public void recorrerDesdeFin() {
        if (fin == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = fin;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
}

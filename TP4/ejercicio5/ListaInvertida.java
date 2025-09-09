package TP4.ejercicio5;

public class ListaInvertida {
    NodoAlumno primero;

    public ListaInvertida() {
        this.primero = null;
    }

    // Inserta el nodo en la lista invertida
    public void insertarAlfabetico(NodoAlumno nodo) {
        if (primero == null || 
            nodo.dato.apellidoNombre.compareToIgnoreCase(primero.dato.apellidoNombre) < 0) {
            nodo.sigAlfabetico = primero;
            primero = nodo;
            return;
        }

        NodoAlumno actual = primero;
        while (actual.sigAlfabetico != null &&
               actual.sigAlfabetico.dato.apellidoNombre.compareToIgnoreCase(nodo.dato.apellidoNombre) < 0) {
            actual = actual.sigAlfabetico;
        }
        nodo.sigAlfabetico = actual.sigAlfabetico;
        actual.sigAlfabetico = nodo;
    }
}

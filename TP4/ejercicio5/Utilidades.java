package TP4.ejercicio5;

class Utilidades {
    // Recorre la lista por curso y arma la invertida
    public static ListaInvertida construirInvertida(ListaCurso lista) {
        ListaInvertida invertida = new ListaInvertida();
        NodoAlumno actual = lista.primero;

        while (actual != null) {
            invertida.insertarAlfabetico(actual);
            actual = actual.sigCurso;
        }
        return invertida;
    }
}
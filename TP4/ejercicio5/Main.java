package TP4.ejercicio5;

public class Main {
    public static void main(String[] args) {
        ListaCurso listaCurso = new ListaCurso();

        // Agregar alumnos (ordenados automáticamente por curso y apellido)
        listaCurso.insertarPorCurso(new Alumno("Britos, Ana", 1, "123", "Calle 1", "1111"));
        listaCurso.insertarPorCurso(new Alumno("Gomez, Luis", 1, "456", "Calle 2", "2222"));
        listaCurso.insertarPorCurso(new Alumno("Sanchez, Marta", 1, "789", "Calle 3", "3333"));
        listaCurso.insertarPorCurso(new Alumno("Alvarez, Juan", 2, "159", "Calle 4", "4444"));
        listaCurso.insertarPorCurso(new Alumno("Ramirez, Pablo", 1, "753", "Calle 5", "5555"));

        // Construir lista invertida
        ListaInvertida listaInvertida = Utilidades.construirInvertida(listaCurso);

        // Mostrar recorrido por curso
        System.out.println("Recorrido por curso:");
        NodoAlumno actual = listaCurso.primero;
        while (actual != null) {
            System.out.println(actual.dato.apellidoNombre + " (" + actual.dato.curso + "ro)");
            actual = actual.sigCurso;
        }

        // Mostrar recorrido por orden alfabético
        System.out.println("\nRecorrido alfabético:");
        actual = listaInvertida.primero;
        while (actual != null) {
            System.out.println(actual.dato.apellidoNombre + " (" + actual.dato.curso + "ro)");
            actual = actual.sigAlfabetico;
        }
    }
}
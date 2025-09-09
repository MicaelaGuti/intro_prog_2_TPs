package TP4.ejercicio5;

public class ListaCurso {
    NodoAlumno primero;

    public ListaCurso() {
        this.primero = null;
    }

    // Inserta ordenado por curso y luego apellido
    public void insertarPorCurso(Alumno a) {
        NodoAlumno nuevo = new NodoAlumno(a);

        if (primero == null ||
            a.curso < primero.dato.curso ||
            (a.curso == primero.dato.curso &&
             a.apellidoNombre.compareToIgnoreCase(primero.dato.apellidoNombre) < 0)) {
            nuevo.sigCurso = primero;
            primero = nuevo;
            return;
        }

        NodoAlumno actual = primero;
        while (actual.sigCurso != null &&
              (actual.sigCurso.dato.curso < a.curso ||
              (actual.sigCurso.dato.curso == a.curso &&
               actual.sigCurso.dato.apellidoNombre.compareToIgnoreCase(a.apellidoNombre) < 0))) {
            actual = actual.sigCurso;
        }
        nuevo.sigCurso = actual.sigCurso;
        actual.sigCurso = nuevo;
    }
}

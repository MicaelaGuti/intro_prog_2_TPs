package TP4.ejercicio5;

public class NodoAlumno {
    Alumno dato;
    NodoAlumno sigCurso;     // enlace a la lista por curso
    NodoAlumno sigAlfabetico; // enlace a la lista invertida

    public NodoAlumno(Alumno dato) {
        this.dato = dato;
        this.sigCurso = null;
        this.sigAlfabetico = null;
    }
}

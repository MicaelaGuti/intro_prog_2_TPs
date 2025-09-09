package TP4.ejercicio5;

public class Alumno {
    String apellidoNombre;
    int curso; // 1 a 6
    String dni;
    String domicilio;
    String telefono;

    public Alumno(String apellidoNombre, int curso, String dni, String domicilio, String telefono) {
        this.apellidoNombre = apellidoNombre;
        this.curso = curso;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
}

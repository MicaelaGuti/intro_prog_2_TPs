package TP4.ejercicio4;

public class Categoria {
    char idCategoria;
    NodoEmpleado empleados; 

    public Categoria(char idCategoria) {
        this.idCategoria = idCategoria;
        this.empleados = null;
    }

    
    public void insertarEmpleadoOrdenado(Empleado e) {
        NodoEmpleado nuevo = new NodoEmpleado(e);

        if (empleados == null || e.apellidoNombre.compareToIgnoreCase(empleados.dato.apellidoNombre) < 0) {
            nuevo.siguiente = empleados;
            empleados = nuevo;
        } else {
            NodoEmpleado actual = empleados;
            while (actual.siguiente != null &&
                   e.apellidoNombre.compareToIgnoreCase(actual.siguiente.dato.apellidoNombre) > 0) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

   
    public void mostrarEmpleados() {
        NodoEmpleado actual = empleados;
        while (actual != null) {
            System.out.println("  - " + actual.dato.apellidoNombre + " | $" + actual.dato.sueldo);
            actual = actual.siguiente;
        }
    }
}

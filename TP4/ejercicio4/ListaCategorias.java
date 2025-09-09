package TP4.ejercicio4;

public class ListaCategorias {
    private NodoCategoria categorias;

    public ListaCategorias() {
        this.categorias = null;
    }

    // Busca o crea una categoría
    private Categoria obtenerOCrearCategoria(char id) {
        NodoCategoria actual = categorias;
        NodoCategoria anterior = null;

        while (actual != null && actual.categoria.idCategoria < id) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null && actual.categoria.idCategoria == id) {
            return actual.categoria;
        }

        Categoria nueva = new Categoria(id);
        NodoCategoria nodoNuevo = new NodoCategoria(nueva);

        if (anterior == null) { // insertar al inicio
            nodoNuevo.siguiente = categorias;
            categorias = nodoNuevo;
        } else {
            nodoNuevo.siguiente = actual;
            anterior.siguiente = nodoNuevo;
        }
        return nueva;
    }

    // Agrega un empleado en la categoría correspondiente
    public void agregarEmpleado(Empleado e) {
        Categoria c = obtenerOCrearCategoria(e.categoria);
        c.insertarEmpleadoOrdenado(e);
    }

    // Muestra todos los empleados de una categoría dada
    public void mostrarCategoria(char id) {
        NodoCategoria actual = categorias;
        while (actual != null) {
            if (actual.categoria.idCategoria == id) {
                System.out.println("Categoría " + id + ":");
                actual.categoria.mostrarEmpleados();
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No existe la categoría " + id);
    }
}

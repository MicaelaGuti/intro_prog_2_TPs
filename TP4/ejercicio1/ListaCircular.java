package TP4.ejercicio1;

public class ListaCircular {
    
        private Nodo primero;
    
        public ListaCircular() {
            this.primero = null;
        }
    
        // Insertar al final
        public void insertar(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (primero == null) {
                primero = nuevo;
                nuevo.setSiguiente(primero); 
            } else {
                Nodo actual = primero;
                while (actual.getSiguiente() != primero) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(nuevo);
                nuevo.setSiguiente(primero);
            }
        }

        //Eliminar de la lista 
        public void eliminar(int num) {
            if (primero == null) {
                return;
            }
        
            Nodo actual = primero;
            Nodo anterior = null;
            boolean encontrado = false;
            boolean dioVueltaCompleta = false;
        
            while (!dioVueltaCompleta && !encontrado) {
                if (actual.getDato() == num) {
                    encontrado = true;
                    if (anterior == null) { 
                        if (actual.getSiguiente() == primero) {
                            primero = null;
                        } else {
                            Nodo ultimo = primero;
                            while (ultimo.getSiguiente() != primero) {
                                ultimo = ultimo.getSiguiente();
                            }
                            primero = primero.getSiguiente();
                            ultimo.setSiguiente(primero);
                        }
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                    if (actual == primero) {
                        dioVueltaCompleta = true;
                    }
                }
            }
        
            if (encontrado) {
                System.out.println("Elemento " + num + " eliminado.");
            } else {
                System.out.println("Elemento " + num + " no encontrado.");
            }
        }

        // mostrar lista 
        public void mostrar(){
            if(primero!=null){
                Nodo actual= primero;
                while(actual.getSiguiente() != primero){
                    System.out.println(actual.getDato() + " ");
                    actual= actual.getSiguiente(); 
                }
                System.out.println(actual.getDato() + " ");
                System.out.println();
            }
        }
        


}

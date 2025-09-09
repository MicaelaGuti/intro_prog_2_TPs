class ejercicio4{
    class Nodo {
        int valor;
        Nodo siguiente;
    
        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }
    
    class Lista {
        Nodo root;
    
        public Lista() {
            root = null;
        }
    
        public void agregar(int valor) {
            Nodo nuevo = new Nodo(valor);
            if(root==null){
                root = nuevo; 
            } else{
                root.siguiente = nuevo;
                root = nuevo;
            }
            
        }

        //imprimir los valores desde el ultimo hasta el primero 
        public void mostrarInvertido() {
            mostrarInvertidoRec(root);
            System.out.println();
        }
        
        private void mostrarInvertidoRec(Nodo nodo) {
            if (nodo == null){
                return; 
            }           
            mostrarInvertidoRec(nodo.siguiente); 
            System.out.print(nodo.valor + " ");  
        }
        
        //Sumar los valores de la lista 
        public int sumarValores() {
            return sumarValoresRec(root);
        }
        
        private int sumarValoresRec(Nodo nodo) {
            if (nodo == null){
                return 0; 
            }                  
            return nodo.valor + sumarValoresRec(nodo.siguiente);  
        }

        //Devolver el menor valor de la lista 
        public int devolverMenor() {
            if (root == null) {
                return 0;
            }
            
            return devolverMenorRec(root, root.valor);
        }
        
        private int devolverMenorRec(Nodo nodo, int menorActual) {
            if (nodo == null){
                return menorActual; 
            }                     
            if (nodo.valor < menorActual) {
                menorActual = nodo.valor; 
            }    
            return devolverMenorRec(nodo.siguiente, menorActual);       
        }
        
    }


    
}
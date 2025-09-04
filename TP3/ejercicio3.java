public class ejercicio3 {
    
    public static boolean esFilaCapicua(char[] [] matriz, int fila, int inicio, int fin ){
        if(inicio>= fin){
            return true; 
        }

        if(matriz[fila][inicio] != matriz[fila][fin]){
            return false; 
        }
        return esFilaCapicua(matriz, fila, inicio+1, fin-1); 
    }

    public static boolean esColumnaCapicua(char [] [] matriz, int columna, int inicio, int fin){
        if(inicio>= fin){
            return true; 
        }

        if(matriz[inicio][columna] != matriz[fin][columna]){
            return false; 
        }

        return esColumnaCapicua(matriz, columna, inicio+1, fin-1); 
    }

    public static boolean esMatrizCapicua(char [] [] matriz, int fila, int columna){
        int n= matriz.length; 
        
        if(fila==n){
            return true; 
        }

        if(!esFilaCapicua(matriz, fila, 0, n-1)){
            return false; 
        }

        if(!esColumnaCapicua(matriz, columna, 0, n-1)){
            return false; 
        }

        return esMatrizCapicua(matriz, fila+1, columna+1); 
    }
}

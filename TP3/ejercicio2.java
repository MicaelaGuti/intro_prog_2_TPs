public class ejercicio2 {
    
    public static boolean esCapicua(int [] arr, int inicio, int fin){
        if(inicio>=fin){
            return true; 
        }
        if(arr[inicio]!=arr[fin]){
            return false; 
        }
        return esCapicua(arr, inicio+1, fin-1); 
    }
}

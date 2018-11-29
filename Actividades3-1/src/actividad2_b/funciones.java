package actividad2_b;

/**
 *
 * @author Borja
 */
public class funciones {
        
  
    public static void invertirArray(int array[]){
        
        int arrayInvertido[] = new int[20];
        int arrayInvNoRepeat[] = new int[20];
        int j = 0;
        
        for (int i = array.length-1; i >= 0; i--) {
 
               arrayInvertido[j] = array[i];
               j++; 
   
        }
        
        for (int i = 0; i < arrayInvNoRepeat.length; i++) {
            if (comprobarRepetido(arrayInvertido,arrayInvNoRepeat,i) == false){
                arrayInvNoRepeat[i] = arrayInvertido[i];
            }
        }
 
        
        for (int i = 0; i < arrayInvNoRepeat.length; i++) {
            
            System.out.print(arrayInvNoRepeat[i]+"   ");
        }
    }   
    
    public static boolean comprobarRepetido(int arrayInvertido[],int arrayInvNoRepeat[],int indice){
        
        boolean repetido = false;
        
        for (int i = arrayInvNoRepeat.length-1; i >= 0; i--) {
            if (arrayInvertido[indice] == arrayInvNoRepeat[i]) {
                repetido = true;
            }
            else 
                repetido = false;
        }
        
        return repetido;
    }
}   

    



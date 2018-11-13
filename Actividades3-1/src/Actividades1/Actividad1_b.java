
package Actividades1;

/**
 *
 * @author Borja
 */
public class Actividad1_b {
    
    public static void main(String[]args){
        
        System.out.println("Los 50 primeros numeros primos son: \n");
        ObtenerPrimos(50);
    }
    
    public static void ObtenerPrimos(int numeros){


        int arrayPrimos[] = new int[numeros];
        
        int numPrimo = 2;
        boolean primo = true;
        
        for (int i = 0; i < arrayPrimos.length; i++) {
            
            int contador = 1;
            
            while(contador != numPrimo){
                if (numPrimo % contador == 0) {

                    primo = false; 
                    
                }
                contador ++;
                
            }
            
            if(primo == true){
            arrayPrimos[i] = numPrimo;}
                       
            numPrimo ++;
             
        }
        
      
        for (int i = 0; i < arrayPrimos.length; i++) {
            
            
            System.out.print(arrayPrimos[i]);
        }
        
        
        
    }
}

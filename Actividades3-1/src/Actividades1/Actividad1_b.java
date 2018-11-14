
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
        int j = 0;
        
        while(j != numeros) {
            
            int divisor = 1;
            //primo = true;
            
            while(divisor != numPrimo){
                if (numPrimo % divisor == 0 && numPrimo != divisor && divisor != 1) {
                    primo = false;
                    divisor = numPrimo;
                }
                else{
                    primo = true;
                    divisor ++;
                }
                
            }
            
            if(primo == true){
                arrayPrimos[j] = numPrimo;
                j++;
            }
                       
            numPrimo ++;
             
        }
        
        j = 0;
        
        for (int i = 0; i < arrayPrimos.length; i++) {
              
            System.out.print(arrayPrimos[i]+"\t");
            j++;
            
            if (j == 10) {
                System.out.println("\n");  
                j= 0;
            }
            
        }
        
        
        
    }
}

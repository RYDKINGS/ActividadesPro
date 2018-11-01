package ets.pkg2;

/**
 *
 * @author Borja
 */
public class InversorString {
    
    private static String cadena="",cadenaInvertida="",cadenaImpar="";
    
    public InversorString(){
          
    }
    
    
    public static String cadenaInvertida(String cadena){

        for (int i = cadena.length()-1; i >= 0; i--){   
            cadenaInvertida += cadena.charAt(i); 
            
        }
            return cadenaInvertida;
        
        }
    
    public static void cadenaImpar(String cadena){
        
        for (int i = 0 ;i < cadena.length()-1; i++) {
            cadenaImpar += cadenaInvertida.charAt(i++); 
        }
        System.out.println(cadenaImpar);
      
    }

   
}

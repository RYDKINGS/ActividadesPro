package Actividades1.actividad1_a;

/**
 *
 * @author Borja
 */
public class dados {
    
    
    public static int tirarDados(int tiradas,int numeroDeLados){
        
        int lanzamiento[] = new int[tiradas];
        int suma = 0;
        
        for (int i = 0; i < lanzamiento.length ; i++) {
            
            lanzamiento[i] = (int)(Math.random()* numeroDeLados);
            
            suma += lanzamiento[i];
        }
        
        return suma;
    }
    
    
    
}

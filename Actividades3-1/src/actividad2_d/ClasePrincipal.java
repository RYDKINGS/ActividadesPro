package actividad2_d;

/**
 *
 * @author Borja
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horario[][] = {{2,4,3,4,5,8,8},
                           {7,3,4,3,3,4,4},
                           {3,3,4,3,3,2,2},
                           {9,3,4,7,3,4,1},
                           {3,5,4,3,6,3,8},
                           {3,4,4,6,3,4,4},
                           {3,7,4,8,3,8,4},
                           {6,3,5,9,2,7,9}};
        
        Clase2 objeto1 = new Clase2();
        
        objeto1.horas(horario);
        
    }
                        
                            
}
    
    

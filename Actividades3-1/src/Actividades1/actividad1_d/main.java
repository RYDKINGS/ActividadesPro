package Actividades1.actividad1_d;
     
/**
 *
 * @author Borja
 */
public class main {
    
    public static void main(String[]args){
        
        ObtencionDatos mejorNota1 = new ObtencionDatos();
        

         double[]  miLista  =  {2.50,  3.50,  1.99,  1.25,  8.75,  5.50,  4.25,  6.00,  7.75,  4.25};    
         String[]  miLista2  =  {"Giuseppe",  "Martina",  "Donald",  "Spinette",  "Mr.Bean",  "Jordi",  "Puchi",  "Pagafantas",  "Epi",  "Blas"}; 
         
         System.out.println("El indice buscado es "+mejorNota1.obtenerNota(miLista));
         mejorNota1.obtenerAlumno(miLista2, miLista);
    }
}

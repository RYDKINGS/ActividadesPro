package Actividades1.actividad1_d;

/**
 *
 * @author Borja
 */
public class ObtencionDatos {
    
    public static int obtenerNota(double lista[]){
        
        //double nota = 0;
        double aux = 0;
        int indice = 0;
        
        for (int i = 0; i < lista.length; i++) {
           
            if (lista[i] > aux) {
                //nota = lista[i];
                indice = i;
            }
            
            aux = lista[i];

        }
        return indice;
        
        
    }
    
    public static void obtenerAlumno(String lista[],double listaNota[]){

        int indiceNombre = obtenerNota(listaNota);
        
        for (int i = lista.length-1; i >= 0 ; i--) {
            
            if (i != indiceNombre) {
               System.out.println(lista[i]+" No es"); 
            }   
            else if(i == indiceNombre)
                System.out.println("--> El nombre buscado es: "+lista[i]+" <--");
        }
        
    }
}

package actividad2_d;

/**
 *
 * @author Borja
 */
public class Clase2 {
    
    public void horas(int horario[][]){
        
        int arrayTotalHoras[][] = new int[8][2];
        //int arrayFinal[][] = null;
        
        for (int i = 0; i < arrayTotalHoras.length; i++) {
            for (int j = 0; j < arrayTotalHoras[i].length; j++) {
                if(j == 0){
                    arrayTotalHoras[i][j] = i;
                }else
                arrayTotalHoras[i][j] = sumarHoras(horario,i);
            }
        }
        
        java.util.Arrays.sort(arrayTotalHoras,1,7);
        
        for (int i = 0; i < arrayTotalHoras.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrayTotalHoras[i].length; j++) {
                System.out.println(arrayTotalHoras[i][j]);
            }
        }  
        
    }
    
    public int sumarHoras(int horario[][],int indice){
        
        int total = 0;
        
        for (int i = indice; i <= indice; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                total += horario[i][j];
            }
            
        }
        
        return total;
    }

}
  


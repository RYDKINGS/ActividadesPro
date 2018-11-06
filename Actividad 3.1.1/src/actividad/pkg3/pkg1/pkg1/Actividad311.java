package actividad.pkg3.pkg1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Actividad311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String cadena1,cadena2;
        
        System.out.print("Introducir la primera cadena: ");
        cadena1 = input.nextLine();
        
        System.out.print("Introducir la segunda cadena: ");
        cadena2 = input.nextLine();
        
        prefijoComun(cadena1,cadena2);
        
     
    }
    
    public static void prefijoComun(String cadena1,String cadena2){
        
        String cadenaComun = "";
        if(cadena1.length() >= cadena2.length()){
            for (int i = 0; i < cadena1.length()-1; i++){
                if(cadena1.charAt(i) != cadena2.charAt(i)){
                    System.out.println("---> "+cadena1.charAt(i)+" y "+cadena2.charAt(i)+" No tienen nada en comun");
                    break;
                }
                else
                    cadenaComun += cadena1.charAt(i);
            } 
        }
        
        System.out.println("Resultado (cadena o caracteres comunes en el prefijo): "+cadenaComun);
    }
    
}

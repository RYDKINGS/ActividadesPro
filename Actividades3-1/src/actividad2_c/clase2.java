/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_c;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class clase2 {

    public static void tostring() {
        
        Scanner input = new Scanner(System.in);
        
        int numEstudiantes;

        System.out.print("Introducir el numero de estudiantes: ");
        numEstudiantes = input.nextInt();
        
        String arrayEstudiante[][] = new String[numEstudiantes][2];
        
        for (int i = 0; i < arrayEstudiante.length; i++) {
            for (int j = 0; j < arrayEstudiante[i].length; j++) { 
                
            System.out.print("Introducir nombre de estudiante #"+i);
            arrayEstudiante[i][j] = input.nextLine();
           
            System.out.print("Introducir nota de estudiante #"+i);
            arrayEstudiante[i][j+1] = input.nextLine();       

            }
        }
        
        System.out.println("------CLASIFICACION------");
        
        java.util.Arrays.sort(arrayEstudiante);
        
        for (int i = 0; i < arrayEstudiante.length; i++) {
            for (int j = 0; j < arrayEstudiante[i].length; j++) {
                
                System.out.println(arrayEstudiante[i][j]);
            }
            
        }
        
    }
    
    
}

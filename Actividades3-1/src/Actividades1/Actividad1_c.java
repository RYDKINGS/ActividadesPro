package Actividades1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Borja
 */
public class Actividad1_c {
    
    public static void main(String[]arg){
        
        Scanner input = new Scanner(System.in);
        String cadena;
        char caracter;
        
        System.out.print("Introduce una cadena cualquiera o texto: ");
        cadena = input.nextLine();
        
        System.out.print("Indicar el caracter que deseas testear: ");
        caracter = input.next().charAt(0);
        
        cuentaLetras(cadena);
        cuentaCaracter(cadena,caracter);
               
    }
    
    public static void cuentaLetras(String cadena){
        
        String regex ="[A-Za-z]";
        int contador = 0;
        
        for (int i = 0; i < cadena.length()-1; i++) {
            
            char aux = cadena.charAt(i);
            String cadenaAux = Character.toString(aux) ;
            
            if (cadenaAux.matches(regex)){
                contador++;
            }
        
        }
        
        System.out.println("El numero de letras presentes en la cadena es de: "+ ++contador);
    }
        
    
    public static void cuentaCaracter(String cadena,char caracter){
        
        int contador = 0;
        
        for (int i = 0; i < cadena.length()-1; i++) {
            
            if (cadena.charAt(i) == caracter){
                contador ++;
            }
        }
        
        System.out.println("El numero de concurrencias del caracter '"+cadena+"' es "+contador);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_a;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class toString {
    
    
    //PREFIJOS INTERNACIONALES
    static String[][] paises = {{"Italia","39","0039"},
                                {"Escocia","44","0044"},
                                {"Brasil","55","0055"},
                                {"Alemania","49","0049"}};
    
    public static void recogidaDatos(){
        
 
        
        Scanner input = new Scanner(System.in);
        String cadena;
        
        for (int i = 0; i < paises.length; i++) {
            System.out.println("");
            for (int j = 0; j < paises[i].length; j++) {
                System.out.print(paises[i][j]+"            ");
            }
            
        }
        
        System.out.println("\n\nNumeros de teléfono internacionales con el formato: 00XX XXXXXX / XX");
        System.out.println("____________________________________________________________________");
        
        System.out.print("Introducir un numero de telefono de 6 cifras, un prefijo y una extension de dos cifras: ");
        cadena = input.nextLine();
        
        formatearCadena(cadena);
        
    }
    
    public static void formatearCadena(String cadena){
        
        String numero,prefijo,extension;
        
        StringBuilder sb = new StringBuilder();
        
        numero = cadena.substring(0,6);
        prefijo = cadena.substring(7,9);
        extension = cadena.substring(10,12);
        
        //Insertamos los datos en el formato establecido 00XX XXXXXX / XX
        
       //00 + PREFIJO  
        sb.insert(0,"00"+prefijo+" ");
        
        //NUMERO
        sb.append(numero);
        sb.append(" / ");
        
        //EXTENSION
        sb.append(extension);
        
        buscarPais(prefijo);

        //IMPRIME RESULTADO FORMATEADO
        System.out.println("El numero formateado es: "+sb);
        
        
    }
    
    public static void buscarPais(String prefijo){
               
        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < paises[i].length; j++) {
                
                if (prefijo.matches(paises[i][j])) {
                    String pais = paises[i][0];
                    System.out.println("...es un numero de "+pais);
                }
            }  
        }
        
    }
    
}

package ets.pkg2;

import ets.pkg2.InversorString;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class ETS2_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String cadena;
        
        //pedimos una cadena por teclado
        System.out.println("Introduce cadena");
        cadena = input.nextLine();
        
        //Creamos un objeto de la clase InversorString llamada inversor
        InversorString inversor = new InversorString();
        
        //Usamos el metodo cadenaInvertda para revertir la cadena que pasamos por argumentos
        System.out.println(inversor.cadenaInvertida(cadena));
        
        //Usamos el metodo cadenaImpar 
        inversor.cadenaImpar(cadena);
        
        
        
            

    }
  
    
}

package Actividades1;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Actividad1_f {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        String id,dominio,numero;
 
        System.out.print("Introduce un identificador de correo (nombre): ");
        id = input.nextLine();
        
        System.out.print("\nIntroduce e dominio de correo (.es o .com): ");
        dominio = input.nextLine();
        
        generadorDeCorreo(id,dominio);
        
        System.out.print("Introduce un numero de 3 cifras: ");
        numero = input.nextLine();
        
        generadorDeContraseña(numero,dominio);
        
      
    }
    
    public static void generadorDeCorreo(String id, String dominio){
        
        String digitosRand = "";
        
        for (int i = 0; i < 10; i++) {
            digitosRand += (int) (Math.random() * 9);
        }
        
        id += digitosRand+"@puchimonti."+dominio;
        
        System.out.println("Tu nnuevo correo es: "+id);
        
    }
    
    public static void generadorDeContraseña(String numero,String dominio){
        
        String letrasRand = "";
        
        for (int i = 0; i < 10; i++) {
            char letra = (char)(Math.random() * (90 - 65) + 65);
            letrasRand += letra;
        }
        
        for (int i = 0; i < 10; i++) {
            char letra = (char)(Math.random() * (122 - 97) + 97);
            letrasRand += letra;
        }
        
        String contraseña = numero+"."+dominio+letrasRand;
        
        System.out.println("Tu nueva contraseña es: "+contraseña);
        
    }
}

package Actividades1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Actividad1_e {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        long num1,num2,num3;
        
        System.out.print("Introducir tres números enteros cualesquiera: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        
        resultados(num1,num2,num3);
    }
    
    public static int sumarDigitos(long num){
        
        long aux;
        int total = 0;
        aux = num;
        
        while(num != 0){
            total += num % 10;
            num /= 10;
        }
        
        return total;
    }
    

    public static void resultados(long num1,long num2,long num3){
        
        int d1 = sumarDigitos(num1);
        int d2 = sumarDigitos(num2);
        int d3 = sumarDigitos(num3);

        int sortArray[] = {d1,d2,d3};
        Arrays.parallelSort(sortArray);

        System.out.println("\nLa suma de los digitos del primero da:" +d1);
        System.out.println("La suma de los digitos del primero da:" +d2);
        System.out.println("La suma de los digitos del primero da:" +d3);
        
        System.out.println("Los valores resultantes de menor a mayor son "+Arrays.toString(sortArray));
        
    }
    
}
        

    


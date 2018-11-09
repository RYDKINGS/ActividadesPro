package actividad.pkg3.pkg4.pkg1;

/**
 *
 * @author Borja
 */
public class Actividad341 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String mazo_cartas[][] = new String[51][2];
        
        int numRand = 0;
        
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 2; j++) {
                
                switch(i % 13){
                    case 0 : mazo_cartas[i][j] = "ace"; break;
                    case 1 : mazo_cartas[i][j] = "2"; break;
                    case 2 : mazo_cartas[i][j] = "3"; break;
                    case 3 : mazo_cartas[i][j] = "4"; break;
                    case 4 : mazo_cartas[i][j] = "5"; break;
                    case 5 : mazo_cartas[i][j] = "6"; break;
                    case 6 : mazo_cartas[i][j] = "7"; break;
                    case 7 : mazo_cartas[i][j] = "8"; break;
                    case 8 : mazo_cartas[i][j] = "9"; break;
                    case 9 : mazo_cartas[i][j] = "10"; break;
                    case 10 : mazo_cartas[i][j] = "Jack"; break;
                    case 11 : mazo_cartas[i][j] = "Reina"; break;
                    case 12 : mazo_cartas[i][j] = "Rey"; break;             
                }
                
                j++;
                
                switch (i / 13) {
                    case 0:
                        mazo_cartas[i][j] = " de Picas";
                        break;
                    case 1:
                        mazo_cartas[i][j] = " de Corazones";
                        break;
                    case 2:
                        mazo_cartas[i][j] = " de Diamantes";
                        break;
                    case 3:
                        mazo_cartas[i][j] = " de Treboles";
                        break;
                }
                
            }
            
        }
        
        for (int i = 0; i < 4; i++){
            numRand = (int) (Math.random() * 51);
            System.out.println("Cojo la carta "+i+" y es la "+numRand+" : "+mazo_cartas[numRand][0]+""+mazo_cartas[numRand][1]);
            
        }
        
        


        /*for (int i = 1; i <= 4; i++) {
            
            int numRand = (int)(Math.random()* 51);
            
            System.out.print("Cojo la "+i+" carta y es la "+numRand+" : ");
            
            switch(numRand % 13){
                case 0 : System.out.print("Ace"); break;
                case 1 : System.out.print("2"); break;
                case 2 : System.out.print("3"); break;
                case 3 : System.out.print("4"); break;
                case 4 : System.out.print("5"); break;
                case 5 : System.out.print("6"); break;
                case 6 : System.out.print("7"); break;
                case 7 : System.out.print("8"); break;
                case 8 : System.out.print("9"); break;
                case 9 : System.out.print("10"); break;
                case 10 : System.out.print("Jack"); break;
                case 11 : System.out.print("Reina"); break;
                case 12 : System.out.print("Rey"); break;             
            }
            
            switch (numRand / 13) {
                case 0:
                    System.out.print(" de picas \n");
                    break;
                case 1:
                    System.out.print(" de corazones \n");
                    break;
                case 2:
                    System.out.print(" de diamantes \n");
                    break;
                case 3:
                    System.out.print(" de treboles \n");
                    break;
            }

                
        }*/

 
    }
          
        
}
    

    


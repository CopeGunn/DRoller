import java.util.Scanner;
import java.util.Random;

public class Menu {

    public static void main(String[] args){
        //Declaraciones iniciales
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

         //Imprimir opciones
        System.out.println(
            "#Dice Roller Sassafras#\n" +
            "$1 = Throw a D6\n" +
            "$2 = Throw a D8\n" +
            "$3 = Throw a D12\n" +
            "$4 = Throw a D20\n" +
            "$5 = Throw a D100\n" +
            "$F = Flip a coin\n" +
            "#exit = Stop the program.\n"
            );
        System.out.print("Option: ");

        //Mientras que cont sea true
            while (cont) {

        //Puntero seleccionador de opción (case)
        System.out.print("\n$ "); 
        String option = scanner.nextLine().toUpperCase();

        //Opciónes (switch cases)
            switch (option) {

            case "1":
                System.out.print("D6: " + diceThrow(6));//6 Caras
                break;

            case "2":
                System.out.print("D8: " + diceThrow(8)); //8 Caras
                break;

            case "3":
                System.out.print("D12: " + diceThrow(12));//12 Caras
                break;

             case "4":
                System.out.print("D20: " + diceThrow(20));//20 Caras
                break;

            case "5":
                System.out.print("D100: " + diceThrow(100));//100 Caras
                break;

             case "F":
                System.out.print("Coin: ");
                if (diceThrow(2) == 1){
                    System.out.print("Heads");
                }
                else
                    System.out.print("Tails");
                break;

            case "420":
                easterEgg();
                break;

            case "EXIT":
                System.out.println("Thanks for using my shitty software c:");
                cont = false;
                break;

            default:
                System.out.println("Well, fuck you too m8!");
            }
            
        } 
        scanner.close();
    }

        public static int diceThrow(int sides){
            Random random = new Random();
            //Valor de 'answ' igual a random limitado por 'sides'
            int answ = random.nextInt(sides) + 1;
            //Imprimir answ + 1 (para descartar el 0)
            //System.out.println(answ + 1);
            return answ;
    }
        public static void easterEgg(){
            Random random = new Random();
            int randEgg = random.nextInt(4);
            switch (randEgg) {

            case 0:
                System.out.println("henlo?");
                break;

            case 1:
                System.out.println("Nothing to see here cawbwoah!");
                break;

            case 2:
                System.out.println("Siempre estoy dado vuelta");
                break;

            case 3:
                System.out.println("");
                break;

            }
            


    }
}
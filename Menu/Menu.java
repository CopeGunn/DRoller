import java.util.Scanner;
import java.util.Random;

public class Menu {

    public static void main(String[] args){
        //Declaraciones iniciales
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        boolean gui = false;
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
            case "GUI":
                guid();
                break;
            case "EXIT":
            case "X":
            case "QUIT":
                System.out.println("Thanks for using my shitty software c:");
                cont = false;
                break;

            default:
                System.out.println("Try again");
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
        public static void guid(){
            Random random = new Random();
            int ascii = random.nextInt(4);
            switch (ascii) {
                case 0:
                    System.out.println(
" ____  ____  _     _       _  _____  _ \n"+
"/  __\\/  _ \\/ \\   / \\     / \\/__ __\\/ \\\n"+
"|  \\/|| / \\|| |   | |     | |  / \\  | |\n"+
"|    /| \\_/|| |_/\\| |_/\\  | |  | |  \\_/\n"+
"\\_/\\_\\\\____/\\____/\\____/  \\_/  \\_/  (_)\n");
                                       
                    break;
                case 1:
                    System.out.println(
" /$$$$$$$            /$$ /$$       /$$   /$$    /$$\n"+
"| $$__  $$          | $$| $$      |__/  | $$   | $$\n"+
"| $$  \\ $$  /$$$$$$ | $$| $$       /$$ /$$$$$$ | $$\n"+
"| $$$$$$$/ /$$__  $$| $$| $$      | $$|_  $$_/ | $$\n"+
"| $$__  $$| $$  \\ $$| $$| $$      | $$  | $$   |__/\n"+
"| $$  \\ $$| $$  | $$| $$| $$      | $$  | $$ /$$   \n"+
"| $$  | $$|  $$$$$$/| $$| $$      | $$  |  $$$$//$$\n"+
"|__/  |__/ \\______/ |__/|__/      |__/   \\___/ |__/\n"
                        );
                    break;
                case 2:
                    System.out.println(
"    ____        ____   _ __  __\n"+
"   / __ \\____  / / /  (_) /_/ /\n"+
"  / /_/ / __ \\/ / /  / / __/ / \n"+
" / _, _/ /_/ / / /  / / /_/_/  \n"+
"/_/ |_|\\____/_/_/  /_/\\__(_)   \n"
                       );
                    break;
                case 3:
                System.out.println(
                    "01010010 01101111 01101100 01101100  01101001 01110100 00100001"
                    );
            }

        }
}
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
            "exit = Stop the program.\n"
            );
        System.out.print("Option ");
        //Mientras que cont sea true
            while (cont) {
        //Seleccionar caso (option)
        System.out.print("$ "); 
        String option = scanner.nextLine();

        // Casos (options)
            switch (option) {
            case "1": 
                System.out.print("D6: "); 
                diceThrow(6); //6 Caras
                cont = true;
                break;
            case "2":
                System.out.print("D8: ");
                diceThrow(8); //8 Caras
                cont = true;
                break;

            case "3":
                System.out.print("D12: ");
                diceThrow(12); //12 Caras
                cont = true;
                break;

             case "4":
                 System.out.print("D20: ");
                diceThrow(20); //20 Caras
                cont = true;
                break;

            case "5":
                System.out.print("D100: ");
                diceThrow(100); //100 Caras
                cont = true;
                break;

            case "420":
                easterEgg();
                cont = true;
                break;

            case "exit":
                System.out.println("Thanks for using my shitty software c:");
                cont = false;
                break;

            default:
                System.out.println("Well, fuck you too m8!");
            }
            
        } 
        scanner.close();
    }

        public static void diceThrow(int sides){
            Random random = new Random();
            //Valor de 'answ' igual a random limitado por 'sides'
            int answ = random.nextInt(sides);
            //Imprimir answ + 1 (para descartar el 0)
            System.out.println(answ + 1);
    }
        public static void easterEgg(){
            Random random = new Random();
            int randEgg = random.nextInt(2);
            switch (randEgg) {

            case 0:
                System.out.println(
                        "Congratulations! you have found my Easter Egg!\n" +
                        "Behind the angelical mother hids the root of all goods and evils\n" +
                        "And when you reach for it, don't you dare to disrespect not a single one\n" +
                        "of your masters, as they are the five truest most faithful sources of\n" +
                        "knowledge of the self and beyond, don't be wise, be truth, no for they, but for thee\n");
                break;

            case 1:
                System.out.println("Nothing to see here cawbwoah!");
                break;

            }
            


    }
}
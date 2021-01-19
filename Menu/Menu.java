import java.util.Scanner;
import java.util.Random;

public class Menu {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean cont = true;



        System.out.println(
            "#Dice Roller Sassafras#\n")

            while (cont) {

        System.out.println(
            "Option 1 = Throw a D6\n" +
            "Option 2 = Throw a D8\n" +
            "Option 3 = Throw a D12\n" +
            "Option 4 = Throw a D20\n" +
            "Option 5 = Throw a D100\n"
            );

        System.out.print("Option: ");
        int exit = scanner.nextInt();


        boolean cont = true;


        
            switch (exit) {
            case 1:
                diceThrow(6);
                cont = false;
                break;
            case 2:
                diceThrow(8);
                
                break;
            case 3:
                diceThrow(12);
                cont = false;
                break;
             case 4:
                diceThrow(20);
                cont = false;
                break;
            case 5:
                diceThrow(100);
                cont = false;
                break;
            default:
                cont = false;
            }
                
            
        }
    }
        public static void diceThrow(int sides){
        Random random = new Random();
        //Valor de 'answ' igual a random limitado por 'sides'
        int answ = random.nextInt(sides);
        //Imprimir answ + 1 (para descartar el 0)
        System.out.println(answ + 1);
    }
}
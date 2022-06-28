import java.util.Scanner;

public class Rangos_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe un número: ");
        int numero =  scanner.nextInt(); scanner.nextLine();

        if((numero>=5 && numero<=7) || (numero>=10 && numero<=12)){
            System.out.println("\n\t Número dentro del rango");
        }else{
            System.out.println("\n\t Número fuera del rango");
        }

        scanner.close();
    }

}

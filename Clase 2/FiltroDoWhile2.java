import java.util.Scanner;

public class FiltroDoWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.print("\n\t Dame un número entre 1 y 3 o entre 7 y 9: ");
            numero = scanner.nextInt(); scanner.nextLine();
        }while ( numero<1 ||(numero>3 && numero<7) || numero>9 );

        System.out.println("\n\t Número aceptado...");
        scanner.close();
    }


}

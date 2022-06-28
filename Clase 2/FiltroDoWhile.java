import java.util.Scanner;

public class FiltroDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.print("\n\t Dame un número entre 1 y 5: ");
            numero = scanner.nextInt(); scanner.nextLine();
        }while (numero<1 || numero>5);

        System.out.println("\n\t Número aceptado...");
        scanner.close();
    }

}

import java.util.Scanner;

public class TestFiltroDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        do{ //Este bloque se repite bajo un condición:
            System.out.print("\n\t Dame un número entre 1 y 5: ");
            numero = scanner.nextInt(); scanner.nextLine();
        }while ( numero<1 || numero>5 );

        System.out.print("\n\t Número aceptado! ");

        scanner.close();

    }

}

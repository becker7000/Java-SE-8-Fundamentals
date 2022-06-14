import java.util.Scanner;

public class TestFiltroDoWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.print("\n\t Escribe un número entre [1,3] U [7,9]: ");
            numero = scanner.nextInt(); scanner.nextLine();
        }while ( numero<1 || (numero>3 && numero<7) || numero>9 ); //Queremos 1,2,3,7,8,9

        System.out.println("\n\t Número aceptado!");

        scanner.close();

    }

}

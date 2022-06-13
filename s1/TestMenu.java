import java.util.Scanner;

public class TestMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t +--------MENÚ-------+" +
                           "\n\t | 1) Primera opción |" +
                           "\n\t | 2) Segundo opción |" +
                           "\n\t | 3) Tercera opción |" +
                           "\n\t | 4) Cuarta opción  |" +
                           "\n\t +-------------------+" +
                           "\n\t ====>> ");

        int opcion= scanner.nextInt(); scanner.nextLine();

        switch (opcion){

            case 1 -> System.out.println("\n\t Soy tu primera opción...");

            case 2 -> System.out.println("\n\t Soy tu segunda opción...");

            case 3 -> System.out.println("\n\t Soy tu tercera opción...");

            case 4 -> System.out.println("\n\t Soy tu cuarta opción...");

            default -> System.out.println("\n\t Soy una opción no contemplada...");

        }

        scanner.close();

    }

}

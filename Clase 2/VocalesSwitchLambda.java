import java.util.Scanner;

public class VocalesSwitchLambda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe una letra: ");

        // char es un tipo de dato primitivo
        // Equivale a 1 byte = 8 bits
        char letra = scanner.nextLine().charAt(0);

        switch (letra){
            case 'a','A','e','E','i','I','o','O','u','U'
                    -> System.out.println("Es vocal");
            default -> System.out.println("\n\t El simbolo no es vocal");
        }

        scanner.close();

    }

}

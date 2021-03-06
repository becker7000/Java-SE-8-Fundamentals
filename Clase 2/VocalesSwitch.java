import java.util.Scanner;

public class VocalesSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe una letra: ");

        // char es un tipo de dato primitivo
        // Equivale a 1 byte = 8 bits
        char letra = scanner.nextLine().charAt(0);

        switch (letra){
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                System.out.println("\n\t Es vocal");
                break;
            default:
                System.out.println("\n\t El simbolo o letra no es vocal");
        }

        scanner.close();

    }

}

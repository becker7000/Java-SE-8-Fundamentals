import java.util.Scanner;

public class EsVocalSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Escribe una letra: ");
        char letra = scanner.nextLine().charAt(0);

        switch (letra){ //Así se vería con el estilo lambda:
            case 'a','A','e','E','i','I','o','O','u','U' -> System.out.print("\n\t Es vocal");
            default -> System.out.print("\n\t El simbolo no es vocal");
        }

        scanner.close();

    }

}

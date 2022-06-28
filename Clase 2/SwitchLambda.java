import java.util.Scanner;

public class SwitchLambda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("  \n\t +---------MENÚ--------+" +
                "\n\t | 1) Primera opción   |" +
                "\n\t | 2) Segunda opción   |" +
                "\n\t | 3) Tercera opción   |" +
                "\n\t | 4) Cuarta opción    |" +
                "\n\t +---------------------+" +
                "\n\t Opción ==> ");
        int opcion = scanner.nextInt(); scanner.nextLine();

        /*
        *  Sentencia simple: System.out.println("Hola");
        *  Sentencia compuesta: {
        *       System.out.println("Hola");
        *       System.out.println("Mundo");
        *  }
        * */

        switch (opcion){
            case 1 ->{
                System.out.println("\n\t Soy la primera opción");
                System.out.println("\n\t También opción primera");
            }
            case 2 -> System.out.println("\n\t Soy la segunda opción");
            case 3 -> System.out.println("\n\t Soy la tercera opción");
            case 4 -> System.out.println("\n\t Soy la cuarta opción");
            default -> System.out.println("\n\t Soy un opción no contemplada");
        }

        scanner.close();

    }

}

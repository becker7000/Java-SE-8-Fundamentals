import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  \n\t +---------MENÚ--------+" +
                           "\n\t | 1) Primera opción   |" +
                           "\n\t | 2) Segunda opción   |" +
                           "\n\t | 3) Tercera opción   |" +
                           "\n\t | 4) Cuarta opción    |" +
                           "\n\t +---------------------+" +
                           "\n\t Opción ==> ");
        int numero = scanner.nextInt(); scanner.nextLine();

        switch (numero){
            case 1:
                System.out.println("\n\t Soy la primera opción");
                System.out.println("\n\t Soy la primera opción también");
                break; //Rompe con el switch
            case 2:
                System.out.println("\n\t Soy la segunda opción");
                break;
            case 3:
                System.out.println("\n\t Soy la tercera opción");
                break;
            case 4:
                System.out.println("\n\t Soy la cuatra opción");
                break;
            default: // Es opcional poner default
                System.out.println("\n\t Soy una opción no contemplada");
                break; // Es opcional poner break
        }

        scanner.close();
    }

}

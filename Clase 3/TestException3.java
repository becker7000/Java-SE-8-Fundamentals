import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.print("\n\t Menú");
        System.out.print("\n\t 1) Primera");
        System.out.print("\n\t 2) Segunda");
        System.out.print("\n\t 3) Tercera");
        System.out.print("\n\t Opción => ");

        try{
            opcion = scanner.nextInt(); scanner.close();
        }catch (InputMismatchException exception){
            System.out.print("\n\t La opción debe ser un número");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }


        System.out.println("\n\t El programa continúa...");

        scanner.close();
    }

}

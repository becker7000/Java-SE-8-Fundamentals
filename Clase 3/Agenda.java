import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        //Varibles globales: serán reconocidas a nivel archivo...
        int opcion=0;
        int id_global=1;

        // Simulador de CRUD de la agenda:
        while(opcion!=5){

            //Ménu:
            System.out.print("\n\t +-------Agenda de contactos-------+");
            System.out.print("\n\t |   Selecciona una opción:        |");
            System.out.print("\n\t |   1) Agregar contacto           |");
            System.out.print("\n\t |   2) Ver contactos              |");
            System.out.print("\n\t |   3) Actualizar contacto        |");
            System.out.print("\n\t |   4) Eliminar contacto          |");
            System.out.print("\n\t |   5) Salir de la agenda         |");
            System.out.print("\n\t +---------------------------------+");
            System.out.print("\n\t ||||| Opción ===> ");
            opcion = scanner.nextInt(); scanner.nextLine();

        }

        scanner.close();

    }

}

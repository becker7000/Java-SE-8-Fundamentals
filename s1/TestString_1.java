import java.util.Scanner;

public class TestString_1 {

    // Atajo: main (genera el punto de entrada)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        //Atajo: sout genera:
        System.out.println("\n\t Nombre: "+nombre);

        //Nota: el método charAt lanza una excepción si nos
        //salimos del rango de longitud del String...
        //System.out.println("\n\t Char: "+nombre.charAt(0));

        System.out.println("\n\t Es vacía? R: "+nombre.isEmpty());

        //Buena practica:
        scanner.close();

    }

}

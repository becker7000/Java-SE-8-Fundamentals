import java.util.Scanner;

public class TestString_1 {

    // Atajo: main (genera el punto de entrada)
    public static void main(String[] args) {

        //Atajo: sout (Nos genera la línea de abajo)
        //System.out.println();
        //Nota: con un solo Scanner ya podemos guardar muchas variables
        Scanner entrada = new Scanner(System.in);

        // Secuencias de escape: \n (salto de linea)
        // \t tabulación (4 espacios normales)
        System.out.print("\n\t Dame tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("\n\t Bienvenid@ "+nombre);

        //Nota: el método charAt lanza una excepción si
        //nos salimos del rango del tamaño de una cadena:
        //System.out.println("\n\t La primera letra es: "+nombre.charAt(0));

        // isEmpty devuelve un verdadero o falso
        System.out.println("\n\t La cadena es vacía? R:"+nombre.isEmpty());

        //Buena practica:
        entrada.close();
    }

}

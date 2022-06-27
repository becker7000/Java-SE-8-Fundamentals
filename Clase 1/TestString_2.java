import java.util.Scanner;

public class TestString_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Dame tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("\n\t Dame tu apellido: ");
        String apellido = entrada.nextLine();

        // Códidos de formato: inician con %
        // Ejemplo: %s <- sirve para imprimir cadenas (Strings)
        System.out.printf("\n\t Hola %s %s, buendo días",nombre,apellido);

        // Para saber el tamaño de un String (Cantidad de caracteres que tiene)
        // usamos el método .length

        // %d <- es el código de formato para imprimir un número entero:
        System.out.printf("\n\t Tu nombre tiene %d letras",nombre.length());

        // Concatenando el nombre con el apellido
        System.out.printf("\n\t Nombre completo: %s",nombre.concat(apellido));

        entrada.close();
    }

}

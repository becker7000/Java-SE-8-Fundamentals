import java.util.Scanner;

public class TestString_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Dame tu nombre: ");
        String nombre=entrada.nextLine();

        System.out.print("\n\t Dame tu apellido: ");
        String apellido=entrada.nextLine();

        // %s es un código de formato para las cadenas:
        System.out.printf("\n\t Hola %s %s, buenos días",nombre,apellido);

        //Cuantas letras tiene el nombre:
        // %d es el código de formato usado para enteros
        System.out.printf("\n\t Tu nombre tiene %d letras",nombre.length());

        System.out.printf("\n\t Nombre completo: %s",nombre.concat(apellido));

        entrada.close();



    }

}

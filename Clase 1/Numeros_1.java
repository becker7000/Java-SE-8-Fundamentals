import java.util.Scanner;

public class Numeros_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame un monto sin IVA: ");
        // Nota: las variables van con snake case:
        // Buena practica, cerramos la línea scanner.nextLine();
        double sin_iva = scanner.nextDouble(); scanner.nextLine();

        //Ejemplo: 100 -> 100+16=116=100*1.16
        double con_iva = sin_iva*1.16;

        // Atajo para print format (souf)
        // %f es el código de formato para imprimir double o float...
        System.out.printf("\n\t El monto con IVA es: %.2f",con_iva);
        // Con %.2f ajustamos la presición del número a dos cifras.

        scanner.close();
    }

}


/*
*   Dame un número: 245.80
*
*   Dame otro número: 30
* */

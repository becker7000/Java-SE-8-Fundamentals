import java.util.Scanner;

public class Numeros_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame un monto: ");
        double monto = scanner.nextDouble(); scanner.nextLine();
        double monto_con_desc = monto*0.85;

        // %c es el código de formato para imprimir un caracter de ASCII
        System.out.printf("\n\t El monto con el 15%c de descuento es: %.2f",37,monto_con_desc);


        scanner.close();
    }

}

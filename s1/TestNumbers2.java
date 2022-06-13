import java.util.Scanner;

public class TestNumbers2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sin_desc, con_desc;
        System.out.print("\n\t Dame un monto: ");
        sin_desc=entrada.nextDouble(); entrada.nextLine();

        con_desc=sin_desc*0.85;

        // %c es código de formato de los char
        System.out.printf("\n\t El monto con el 15%c de descuento es: %.2f",37,con_desc);

        entrada.close();

    }

}

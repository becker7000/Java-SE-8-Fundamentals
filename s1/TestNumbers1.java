import java.util.Scanner;

public class TestNumbers1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sinIva, conIva;

        System.out.print("\n\t Dame un monto sin I.V.A. => ");
        //Buena practica: cerramos la línea:
        sinIva=scanner.nextDouble(); scanner.nextLine();

        // 100*1.16 -> 116
        conIva=sinIva*1.16; //Calculamos el monto ya con I.V.A.

        // %f es código de formato para trabajar con float, double
        System.out.printf("\n\t Monto con I.V.A. => %.2f",conIva);

        scanner.close();
    }

}

import java.util.Scanner;

public class TrianguloASCII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame un número: ");
        int num = scanner.nextInt(); scanner.nextLine();

        int i=0,j;
        while (i<=num){
            System.out.print("\n\t\t\t "); //Hacemos un salto de línea
            j=0; // Se reinicia el valor de j
            while (j<i){ //La cantidad de iteraciones depende de i
                System.out.printf("\t %c",95);
                j++; //Incremento para el while interno
            }
            i++; //Incremento para el while externo
        }

        scanner.close();

    }

}

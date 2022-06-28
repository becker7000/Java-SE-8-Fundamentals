import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe un número entero: ");
        int entero = scanner.nextInt(); scanner.nextLine();

        if(entero<0){
            System.out.println("\n\t El número está en los negativos");
        }else if (entero>0){
            System.out.println("\n\t El número está en los positivos");
        }else{
            System.out.println("\n\t El número es cero");
        }

        scanner.close();
    }

}

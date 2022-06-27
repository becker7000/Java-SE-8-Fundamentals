import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe un numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Evita errores al captar un entero...

        // -4,-3,-2,-1,0,1,2,3,4
        if(numero>0){
            System.out.println("\n\t El número es positivo...");
        }

        //System.out.println(numero>0);

        scanner.close();
    }

}

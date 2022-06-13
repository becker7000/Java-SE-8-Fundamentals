import java.util.Scanner;

public class Rangos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Escribe un número dentro de [5,7]U[10,12]: ");
        int numero = scanner.nextInt(); scanner.nextLine();

        if ((numero>=5 && numero<=7) || (numero>=10 && numero<=12)){
            System.out.println("\n\t Dentro del rango");
        }else{
            System.out.println("\n\t Fuera del rango");
        }

        scanner.close();
    }

}

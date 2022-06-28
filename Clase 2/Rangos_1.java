import java.util.Scanner;

public class Rangos_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe un número: ");
        int numero =  scanner.nextInt(); scanner.nextLine();

        // 2,3,4,5 [2,5]
        if(numero>=2 && numero<=5){
            System.out.print("\n\t Número dentro del rango");
        }else{
            System.out.print("\n\t Número fuera de rango");
        }

        scanner.close();

    }

}

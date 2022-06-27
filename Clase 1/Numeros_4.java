import java.util.Scanner;

public class Numeros_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\t Dame una cantidad de segundos: ");

        //Cerramos la línea cuando pedimos enteros o doubles
        int segundos = scanner.nextInt(); scanner.nextLine();
        System.out.printf("\n\t %d segundos son equviales a: ",segundos);

        int minutos = segundos/60; // 400/60 = 6
        segundos=segundos%60;
        System.out.println(minutos+":"+segundos);
        //System.out.printf(" %d %c %d (minutos %c segundos) ",minutos,58,segundos,58);

        // 6:40
        scanner.close();
    }

}

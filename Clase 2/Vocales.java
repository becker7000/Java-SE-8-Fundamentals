import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Escribe una letra: ");

        // char es un tipo de dato primitivo
        // Equivale a 1 byte = 8 bits
        char letra = scanner.nextLine().charAt(0);

        // Algoritmo para saber si es vocal o no
        if(letra=='a' || letra=='A'){
            System.out.println("\n\t Primera vocal");
        }else if(letra=='e' || letra=='E'){
            System.out.println("\n\t Segunda vocal");
        }else if(letra=='i' || letra=='I'){
            System.out.println("\n\t Tercera vocal");
        }else if(letra=='o' || letra=='O'){
            System.out.println("\n\t Cuarta vocal");
        }else if(letra=='u' || letra=='U'){
            System.out.println("\n\t Quinta vocal");
        }else{
            System.out.println("\n\t El simbolo o letra no es vocal");
        }

        scanner.close();
    }

}

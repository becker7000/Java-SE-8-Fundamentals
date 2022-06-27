import java.util.Scanner;

public class Numeros_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Dame tu masa(kg): ");
        double masa = scanner.nextDouble(); scanner.nextLine();
        System.out.print("\n\t Dame tu estatura(m): ");
        double estatura = scanner.nextDouble(); scanner.nextLine();

        //Linealizamos la formula del IMC.
        double imc = masa/(Math.pow(estatura,2));
        System.out.printf("\n\t Tu masa corporal es: %.3f",imc);

        scanner.close();
    }

}

/*
  Nota: el resto da como resultado lo que sobre de dividir un número
  de forma entera:

   10 % 7 = 3
   23 % 6 = 5
   90 % 15 = 0
   8 % 2 = 0
   7 % 2 = 1
   150 % 60 = 30

 */
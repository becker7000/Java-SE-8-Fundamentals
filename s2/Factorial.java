import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // 4! = 4*3*2*1 = 24
        // 3! = 3*2*1 = 6
        // 0! = 1
        Scanner scanner = new Scanner(System.in);
        int natural;

        do{
            System.out.print("\n\t Dame un natural entre 0 y 20: ");
            // 1,2,3,4,...
            natural = scanner.nextInt(); scanner.nextLine();
        }while (natural<1 || natural>20);

        // Nota: las multiplicaciones se inician en 1.
        long factorial=1; // long nos permite hasta 20!

        for(int i=natural; i>0; i--){
            factorial*=i; //factorial=factorial*i;
        }

        System.out.printf("\n\t %d ! = %d",natural,factorial);

        // i=4
        // fac=1*4=4
        // i--
        // fac=4*3=12
        // i--
        // fac=12*2=24

        scanner.close();
    }

}

import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un número: ");
        int numero= entrada.nextInt(); entrada.nextLine();

        // ...,-4,-3,-2,-1,0,1,2,3,4,5,...
        if(numero>=0){
            if(numero>0){
                System.out.println("\n\t El número es positivo");
            }else{
                System.out.println("\n\t El número es cero");
            }
        }else{
            System.out.println("\n\t El número es negativo");
        }

        entrada.close();
    }

}

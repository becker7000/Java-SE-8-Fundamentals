import java.util.Scanner;

public class LoginSencillo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "1234x";
        System.out.print("\n\t Escribe tu contraseña: ");
        String passIn=scanner.nextLine();

        if(password.equals(passIn)){
            System.out.print("\n\t Acceso concedido");
        }else{
            System.out.print("\n\t Acceso denegado");
        }

        scanner.close();

    }

}

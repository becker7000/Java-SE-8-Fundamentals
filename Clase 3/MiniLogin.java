import java.util.Scanner;

public class MiniLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = "1234x";

        System.out.print("\n\t Escribe la contraseña: ");
        String password = scanner.nextLine();

        if(pass.equals(password)){
            System.out.print("\n\t Acceso permitido...");
        }else{
            System.out.print("\n\t Acceso denegado...");
        }

        scanner.close();
    }

}

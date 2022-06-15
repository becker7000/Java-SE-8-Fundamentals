public class TestException2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        double div;

        try {
            div = a / b;
            System.out.printf("\n\t División: %.2f", div);
        }catch (ArithmeticException exception){
            System.out.printf("\n\t Mensaje: %s",exception.getMessage());
            System.out.println("\n\t No puedes divir por cero...");
        }

    }

}

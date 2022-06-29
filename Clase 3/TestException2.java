public class TestException2 {

    public static void main(String[] args) {

        int a=7,b=0;
        double division;

        try{
            division=a/b;
            System.out.printf("\n\t La división es: %f",division);
        }catch (ArithmeticException exception){
            System.out.print("\n\t No puedes dividir por cero...");
            System.out.print("\n\t "+exception.getMessage());
        }

        System.out.println("\n\t Exception controlada");

    }

}

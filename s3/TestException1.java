import java.util.Date;

public class TestException1 {

    public static void main(String[] args) {

        String sSueldo="2000w";
        double dSueldo;

        try{ //Línea que puede generar una Exception
            dSueldo= Double.parseDouble(sSueldo);
            System.out.printf("\n\t El sueldo es: %.2f",dSueldo);
        }catch (NumberFormatException exception){
            System.out.printf("\n\t Mensaje: %s",exception.getMessage());
            System.out.print("\n\t Error al transformar un tipo de dato a otro...");
        }

        Date fecha = new Date();
        System.out.println("\n\t"+fecha);

    }

}

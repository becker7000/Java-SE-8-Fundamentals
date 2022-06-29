public class TestException1 {

    public static void main(String[] args) {

        String str_sueldo = "25000w";
        double dou_sueldo;

        try{
            dou_sueldo = Double.parseDouble(str_sueldo);
            System.out.printf("\n\t El sueldo es: %.2f",dou_sueldo);
        }catch (NumberFormatException exception){
            System.out.print("\n\t Error al transformar un dato");
            System.out.print("\n\t Mensaje: "+exception.getMessage());
        }

        // Mensaje final:
        System.out.println("\n\t El programa ha continuado con éxito...");
    }

}

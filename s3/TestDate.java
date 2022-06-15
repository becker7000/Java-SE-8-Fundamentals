import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.print("\n\t Fecha: "+fecha);
        System.out.print("\n\t Día: "+fecha.getDate());
        System.out.print(" Mes: "+fecha.getMonth());
        System.out.print(" Año: "+fecha.getYear());

        System.out.print("\n\t Hora: "+fecha.getHours());
        System.out.print(" Minutos: "+fecha.getMinutes());
        System.out.print(" Segundos: "+fecha.getSeconds());


    }

}

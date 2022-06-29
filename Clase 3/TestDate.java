import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        int dia = fecha.getDate()-1;
        // getDay nos da el número de la semana
        // domingo = 0, lunes = 1,...
        // getDate nos da el número del día del mes
        // Meses: enero =0, febrero=1

        System.out.print("\n\t Fecha: "+fecha);
        System.out.print("\n\t Día: "+dia);
        System.out.print("\n\t Mes: "+fecha.getMonth());
        System.out.print("\n\t Año: "+fecha.getYear());

        System.out.print("\n\t Horas: "+fecha.getHours());
        System.out.print(" Minutos: "+fecha.getMinutes());
        System.out.print(" Segundos: "+fecha.getSeconds());


    }

}

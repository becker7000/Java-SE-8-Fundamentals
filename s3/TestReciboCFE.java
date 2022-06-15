public class TestReciboCFE {

    public static void main(String[] args) {

        ReciboCFE reporte1 = new ReciboCFE(600.5);
        ReciboCFE reporte2 = new ReciboCFE(1125.9);
        ReciboCFE reporte3 = new ReciboCFE(1789.2);

        System.out.println(reporte1.generarReporte());
        System.out.println(reporte2.generarReporte());
        System.out.println(reporte3.generarReporte());

    }

}

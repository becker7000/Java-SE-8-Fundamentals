public class TestReciboCFE {

    public static void main(String[] args) {

        ReciboCFE recibo1 = new ReciboCFE(760.34);
        ReciboCFE recibo2 = new ReciboCFE(1187.56);
        ReciboCFE recibo3 = new ReciboCFE(2310.14);

        System.out.println(recibo1.generarReporte());
        System.out.println(recibo2.generarReporte());
        System.out.println(recibo3.generarReporte());

    }

}

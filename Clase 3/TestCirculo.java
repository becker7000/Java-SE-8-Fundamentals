public class TestCirculo {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3.8);
        System.out.println(circulo1);

        Circulo circulo2 = new Circulo(10.2);
        System.out.println(circulo2);

        System.out.println("\n\t Area C1: "+circulo1.calcularArea());
        System.out.println("\n\t Area C2: "+circulo2.calcularArea());
        System.out.println("\n\t Suma de las areas: "+circulo1.sumarAreaCon(circulo2));

    }

}

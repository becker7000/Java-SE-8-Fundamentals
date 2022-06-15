public class TestCirculo {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(7.5);
        System.out.println(c1);

        Circulo c2 = new Circulo(11.9);
        System.out.println(c2);

        //Trabajando con sus áreas:
        System.out.printf("\n\t Área de C1: %.3f",c1.calcularArea());
        System.out.printf("\n\t La suma de las areas de C1 y de C2: %.3f",c1.sumarAreaCon(c2));

        Circulo c3 = new Circulo(34.2);

        Circulo c4 = new Circulo();
        System.out.println("\n\t "+c4);

        System.out.print("\n\t Probando la sobrecarga de sumarAreaCon");
        System.out.printf("\n\t La suma de áreas de c3 y de c4: %.3f",c3.sumarAreaCon(c4.calcularArea()));

        Circulo.cuantosCirculosHay();

    }

}

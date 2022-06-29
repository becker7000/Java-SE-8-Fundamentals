public class TestCirculo {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3.8);
        System.out.println(circulo1);

        Circulo circulo2 = new Circulo(10.2);
        System.out.println(circulo2);

        Circulo circulo3 = new Circulo(2);
        Circulo circulo4 = new Circulo(); //Le asigna en automatico radio=1

        System.out.println("\n\t Area C1: "+circulo1.calcularArea());
        System.out.println("\n\t Area C2: "+circulo2.calcularArea());
        System.out.println("\n\t Suma de las areas: "+circulo1.sumarAreaCon(circulo2));

        System.out.println("\n\t Suma A3 + A4 = "+
                circulo3.sumarAreaCon(circulo4.calcularArea()));
        // Forma de usar un método estático
        // No requerimos instanciar ningún objeto...
        Circulo.cuantosCirculosHay();

    }

}

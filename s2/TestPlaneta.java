public class TestPlaneta {

    public static void main(String[] args) {

        // Creando instacias(objetos) de la clase Planeta:
        Planeta planeta1 = new Planeta("Mercurio",1);
        Planeta planeta2 = new Planeta("Venus",2);
        Planeta planeta3 = new Planeta("Tierra",3);

        //Aplicando un método a los objetos:
        planeta1.mostrarPlaneta();
        planeta2.mostrarPlaneta();
        planeta3.mostrarPlaneta();

        System.out.println("\n\t Nombre de algun planeta: "+planeta1.getNombre());

        planeta3.setNombre("Azul");
        planeta3.mostrarPlaneta();

    }

}

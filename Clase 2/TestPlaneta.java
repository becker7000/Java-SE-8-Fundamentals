
public class TestPlaneta {

    public static void main(String[] args) {

        // Instancias(Objeto) de la clase Planeta:
        Planeta p1 = new Planeta("Mercurio",1,"Café");
        Planeta p2 = new Planeta("Venus",2,"Morado");
        Planeta p3 = new Planeta("Tierra",3,"Azul");

        // Aplicando un método a las instancias(objeto)
        p1.mostrarPlaneta();
        p2.mostrarPlaneta();
        p3.mostrarPlaneta();

        // El setter reajusta un valor
        p1.setNombre("Marte");
        // El getter nos muestra un valor
        System.out.println("\n\t Nuevo nombre: "+p1.getNombre());

    }

}

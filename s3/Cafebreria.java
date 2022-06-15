import java.util.ArrayList;

public class Cafebreria {

    public static void main(String[] args) {

        Libro libro1 = new Libro(TipoArticulo.LIBRO,"L01LO",245.9,"Breve historia del tiempo");
        Bebida bebida1 = new Bebida(TipoArticulo.BEBIDA,"B01BK",55.9,TipoCafe.AMERICANO);
        Libro libro2 = new Libro(TipoArticulo.LIBRO,"L02L0",310.2,"Programador pragmatico");

        libro1.mostrar();
        bebida1.mostrar();
        libro2.mostrar();

        //Lista de precios:
        ArrayList<IPrecio> precios = new ArrayList<>();

        // Generamos dos objetos interfaces que están límitados
        // a los métodos de la interface:
        IPrecio ip1 = libro1;
        IPrecio ip2 = bebida1;
        IPrecio ip3 = libro2;

        precios.add(ip1);
        precios.add(ip2);
        precios.add(ip3);

        double total=0;

        for (IPrecio precio : precios ) {
            total+=precio.getPrecio();
        }

        System.out.printf("\n\t Total a paga es: $%.2f",total);

    }

}

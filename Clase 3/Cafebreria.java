import java.util.ArrayList;

public class Cafebreria {

    public static void main(String[] args) {

        Articulo a1 = new Libro("L01",245,"La conjetura de GoldBach","Drimiti");
        Articulo a2 = new Libro("L02",180,"Alimenta la mente","Lewis Carroll");
        Articulo a3 = new Bebida("B01",60,"Cold Brew");
        Articulo a4 = new Bebida("B02",55,"Té Chai");

        // Creando objetos interfaz:
        IPrecio i1 = (IPrecio) a1;
        IPrecio i2 = (IPrecio) a2;
        IPrecio i3 = (IPrecio) a3;
        IPrecio i4 = (IPrecio) a4;


        ArrayList<IPrecio> precios = new ArrayList<>();
        precios.add(i1);
        precios.add(i2);
        precios.add(i3);
        precios.add(i4);

        double totalAPagar=0;

        for (IPrecio precio : precios) {
            totalAPagar+=precio.getPrecio();
        }

        System.out.printf("\n\t Total a pagar: $%.2f",totalAPagar);
        // TODO: Crear una clase Souvenir y que implemente la interfaz IPrecio


    }

}

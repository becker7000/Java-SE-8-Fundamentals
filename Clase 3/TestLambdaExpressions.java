import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class TestLambdaExpressions {

    public static void main(String[] args) {

        List<Contacto> contactos = new ArrayList<>();
        Contacto c1 = new Contacto("Pepe",29);
        Contacto c2 = new Contacto("Maria",25);
        Contacto c3 = new Contacto("Alfredo",44);
        Contacto c4 = new Contacto("Paula",59);

        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);
        contactos.add(c4);

        // Java con inferencia de tipos de datos sabe que contacto es de tipo Contacto
        contactos.forEach( contacto ->
                System.out.print("\n\t Nombre: "+
                        contacto.getNombre().toUpperCase(Locale.ROOT)));

        // Ordenamiento a través de la edad
        contactos.sort(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto A, Contacto B) {
                return (A.getEdad()>B.getEdad())? 1 : -1;
            }
        });

        // Imprimimos nuevamente la lista usando Lambdas
        contactos.forEach(contacto -> contacto.mostrar());

        // Tip: para crear funciones con Lambdas:
        Function<Integer,Integer> potencia = x -> x*x;
        // Esta interfaz cuenta con un método ya implementado llamado apply
        System.out.printf("\n\t 4 al cuadrado es: %d",potencia.apply(4));

    }

}

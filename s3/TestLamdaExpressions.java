import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class TestLamdaExpressions {

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Carlos",29);
        Usuario u2 = new Usuario("Maria",25);
        Usuario u3 = new Usuario("Alfredo",44);
        Usuario u4 = new Usuario("Paula",51);

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        usuarios.forEach( usuario -> System.out.printf("\n\t Nombre: " +
                "%s",usuario.getNombre().toUpperCase(Locale.ROOT)) );

        //Ordenamos la lista a través de la edad.
        usuarios.sort(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario A, Usuario B) {
                return A.getEdad() > B.getEdad() ? 1 : -1 ;
            }
        });   // 30, 26, 34, 40

        usuarios.forEach( usuario -> System.out.println(usuario));

    }

}

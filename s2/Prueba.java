import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Prueba {

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Luis",34);
        Usuario u2 = new Usuario("Ana",15);
        Usuario u3 = new Usuario("Pepe",20);
        Usuario u4 = new Usuario("Jose",28);

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        usuarios.forEach(usuario -> System.out.printf("\n\t %s",usuario.getNombre().toUpperCase(Locale.ROOT)));

        usuarios.sort(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getEdad()>o2.getEdad() ? 1 : -1;
            }
        });

        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });

    }

}

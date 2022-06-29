import java.util.ArrayList;

public class TestClinica {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Eduardo",30,"Cardiologia");
        Doctor d2 = new Doctor("Laura",34,"Nutrición");

        Deportista dep1 = new Deportista("Cristiano",37,"Soccer");
        Deportista dep2 = new Deportista("Usain",33,"Atletismo");

        // Aquí se da el polimorfismo:
        /* d1.mostrar();
        d2.mostrar();
        dep1.mostrar();
        dep2.mostrar(); */

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(d1);
        usuarios.add(d2);
        usuarios.add(dep1);
        usuarios.add(dep2);

        // Usando foreach
        for(Usuario usuario : usuarios){
            usuario.mostrar();
        }


    }

}

import java.util.ArrayList;

public class TestClinicaDeportiva {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        Persona p1 = new Doctor("Paco",31,"Cardiología");
        Persona p2 = new Doctor("Laura",26,"Neumología");
        Persona p3 = new Deportista("Ronaldo",36,"Soccer");
        Persona p4 = new Deportista("Usain Bold",30,"Atletismo");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        for (Persona persona : personas){
            persona.mostrar();
        }

    }

}

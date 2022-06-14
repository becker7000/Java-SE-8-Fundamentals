public class TestClinicaDeportiva {

    public static void main(String[] args) {

        Persona p1 = new Doctor("Paco",31,"Cardiología");
        Persona p2 = new Doctor("Laura",26,"Neumología");
        Persona p3 = new Deportista("Ronaldo",36,"Soccer");
        Persona p4 = new Deportista("Usain Bold",30,"Atletismo");

        //Llevamos acabo el polimorfismo.
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        p4.mostrar();

    }

}

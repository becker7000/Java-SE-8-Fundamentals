public class Deportista extends Persona {

    //Atributo exclusivo de la clase Deportista:
    //A los atributos también se les conoce como variables de campo:
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    @Override
    public void mostrar() {
        System.out.printf("\n\t +-----DEPORTISTA-------+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Deporte: %s" +
                          "\n\t +------------------+",nombre,deporte);
    }
}

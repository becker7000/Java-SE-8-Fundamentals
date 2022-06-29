public class Deportista extends Usuario {

    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    @Override
    public void mostrar(){
            System.out.printf("\n\t +------DEPORTISTA-----+" +
                    "\n\t | Nombre: %s" +
                    "\n\t | Deporte: %s", nombre, deporte);
    }

}

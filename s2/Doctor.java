public class Doctor extends Persona{

    //Atributos:
    private String especialidad;

    //Constructor:
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad); //Super hacer referencia al constructor de la clase padre Persona
        this.especialidad = especialidad; //this hace referencia a esta clase Doctor
    }

    //Sobre-escritura del método mostrar()
    @Override
    public void mostrar() {
        System.out.printf("\n\t +-----DOCTOR-------+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Especialidad: %s" +
                          "\n\t +------------------+",nombre,especialidad);
    }
}

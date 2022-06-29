public class Doctor extends Usuario {

    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre,edad); // hace referencia a la superclase
        this.especialidad = especialidad; // hace referencia a esta misma clase
    }

    @Override // Sobreescritura
    public void mostrar() {
        System.out.printf("\n\t +------DOCTOR-----+" +
                          "\n\t | Nombre: %s" +
                          "\n\t | Especialidad: %s",nombre,especialidad);
    } // Todos los atributos de super clase que tengan protected
     // serán reconocidos por la subclase...

}

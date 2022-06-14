public abstract class Persona {

    // protected nos ayuda a que estos atributos seas
    // visibles por las clase hijas de la clase Persona
    protected String nombre;
    protected int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto:
    // Crear un método abstracto obliga a las clases hijas a
    // implementarlo y definirlo dentre de ellas.
    public abstract void mostrar();


}

public abstract class Usuario {

    // Atributos:
    protected String nombre;
    protected int edad;

    //Constructor
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Los métodos abstractos son métodos
    // que no requieren de un bloque de código
    // sólo se crea el puro prototipo
    // ya que éste será definido por las clase hijas...
    public abstract void mostrar();

}
/*
*   Una clase abstracta es aquella que no se va a instanciar
*   es decir, sólo la usamos para crear otras clases hijas...
*
* */

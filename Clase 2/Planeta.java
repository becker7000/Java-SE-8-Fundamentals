public class Planeta {

    private String nombre;
    private int posicion;
    private String color;

    public Planeta(String nombre, int posicion, String color) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarPlaneta(){
        System.out.printf("\n\t +---Planeta----+" +
                          "\n\t | Nombre: %s " +
                          "\n\t | Posición: %d",nombre,posicion);
    }
}

public class Planeta {

    //Atributos:
    private String nombre;
    private double area;
    private String color;
    private int posicion;

    //Métodos:
    public Planeta(String nombre, int posicion){
        this.nombre=nombre;
        this.posicion=posicion;
    }

    // Getters y setters:

    //Los getters nos permite obtener el valor de atributo:
    public String getNombre(){
        return nombre;
    }

    //Los setters nos permite ajustar el valor de atributo:
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void mostrarPlaneta(){
        System.out.println("\n\tNombre: "+nombre);
        System.out.println("\tPosición: "+posicion);
    }

}

public abstract class Articulo {

    protected String codigo;
    protected double precio;

    public Articulo(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    //El getter proximamente va a implementar una interfaz
    public double getPrecio(){
        //Buena practica de seguridad:
        double clonePrecio=precio;
        return clonePrecio;
    }

    public abstract void mostrar();

}

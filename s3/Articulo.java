public abstract class Articulo {

    protected TipoArticulo tipo;
    protected String codigo;
    protected double precio;

    public Articulo(TipoArticulo tipo, String codigo,double precio) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrar();

}

public class Bebida extends Articulo implements IPrecio{

    private String nombre;

    public Bebida(String codigo, double precio, String nombre) {
        super(codigo, precio);
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.printf("\n\t Bebida { Nombre: %s | Precio: $%.2f }",nombre,precio);
    }
}

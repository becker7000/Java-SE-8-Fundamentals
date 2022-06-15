public class Libro extends Articulo implements IPrecio{

    private String nombre;

    public Libro(TipoArticulo tipo, String codigo, double precio, String nombre) {
        super(tipo, codigo, precio);
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.print("\n\t +-------LIBRO--------+");
        System.out.print("\n\t | Código: "+codigo);
        System.out.print("\n\t | Precio: $"+precio);
        System.out.print("\n\t | Nombre: "+nombre);
    }
}

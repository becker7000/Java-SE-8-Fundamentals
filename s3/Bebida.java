public class Bebida extends Articulo implements IPrecio{

    private TipoCafe cafe;

    public Bebida(TipoArticulo tipo, String codigo, double precio, TipoCafe cafe) {
        super(tipo, codigo, precio);
        this.cafe = cafe;
    }

    @Override
    public void mostrar() {
        System.out.print("\n\t +-------CAFÉ--------+");
        System.out.print("\n\t | Código: "+codigo);
        System.out.print("\n\t | Precio: $"+precio);
        System.out.print("\n\t | Tipo: "+cafe);

    }
}

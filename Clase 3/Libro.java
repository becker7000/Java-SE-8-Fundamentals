public class Libro extends Articulo implements IPrecio{

    private String titulo;
    private String autor;

    public Libro(String codigo, double precio, String titulo, String autor) {
        super(codigo, precio);
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void mostrar() {
        System.out.printf("\n\t Libro { Título: %s | Autor: %s | Precio: $%.2f }",titulo,autor,precio);
    }
}

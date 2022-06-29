public class Contacto {

    //Atributos:
    private int id;
    private String nombre;
    private String telefono;

    //Contacto:
    public Contacto(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(){
        this.id=(int)(Math.random()*100)+200;
        this.nombre="Sin nombre";
        this.telefono="Sin telefono";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarContacto(){
        System.out.printf("\n\t Contacto{ Id: %s | Nombre: %s | Telefono: %s}" +
                "",id,nombre,telefono);
    }

}

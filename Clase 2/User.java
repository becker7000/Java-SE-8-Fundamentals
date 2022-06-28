public class User {

    // Atributos (datos) hacemos referencia a ellos con 'this':
    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor
    // Los constructores llevan el mismo nombre de la clase
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    // Los getters sirven para entregar datos:
    // Este método devuelve un String que es nombre
    public String getName(){
        return name;
    }

    // Los setters sirven para modificar el valor de un atributo:
    public void setName(String name){
        this.name=name;
    }

    // Método personalizado:
    public void showUser(){
        System.out.printf("\n\t +-----User-----+" +
                          "\n\t | Name: %s " +
                          "\n\t | Email: %s" +
                          "\n\t +--------------+");
    }

    // POJO: Plain Old Java Objet

}

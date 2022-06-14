public class User {

    //Atributos de la clase User:
    int id;
    String name;
    String email;
    String address;
    String phoneNumber;

    //Constructor:
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Método de la clase User:
    public void showUser(){
        System.out.println("\n\t Name: "+name);
        System.out.println("\n\t Email: "+email);
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        //Varibles globales: serán reconocidas a nivel archivo...
        int opcion=0;
        int id_global=1;

        //Variable auxiliares locales:
        String nombre = "";
        String telefono = "";
        int id_contacto=0;
        boolean banderilla;

        // Simulador de CRUD de la agenda:
        while(opcion!=5){

            banderilla=false;
            //Ménu:
            System.out.print("\n\t +-------Agenda de contactos-------+");
            System.out.print("\n\t |   Selecciona una opción:        |");
            System.out.print("\n\t |   1) Agregar contacto           |");
            System.out.print("\n\t |   2) Ver contactos              |");
            System.out.print("\n\t |   3) Actualizar contacto        |");
            System.out.print("\n\t |   4) Eliminar contacto          |");
            System.out.print("\n\t |   5) Salir de la agenda         |");
            System.out.print("\n\t +---------------------------------+");
            System.out.print("\n\t ||||| Opción ===> ");
            opcion = scanner.nextInt(); scanner.nextLine();

            // Funcionalidad de cada opcion

            switch (opcion){
                case 1 -> { // Agregar contacto
                    System.out.print("\n\t (A) Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("\n\t (A) Telefono: ");
                    telefono = scanner.nextLine();
                    Contacto contacto = new Contacto(id_global,nombre,telefono);
                    id_global++;
                    contactos.add(contacto);
                    System.out.print("\n\t Contacto guardado...");
                    contacto.mostrarContacto();
                }
                case 2 -> { // Ver la lista de contactos
                    System.out.print("\n\t +-------Lista de contactos-------+");
                    if(contactos.isEmpty()){
                        System.out.print("\n\t | La lista de contactos está vacía ");
                    }else{
                        for (Contacto contacto: contactos) {
                            contacto.mostrarContacto();
                        }
                    }
                }
                case 3 -> { // Actualizar contacto
                    System.out.print("\n\t Dame el id: ");
                    id_contacto = scanner.nextInt(); scanner.nextLine();

                    // Algoritmo para buscar el id:
                    for(Contacto contacto : contactos){
                        if(id_contacto==contacto.getId()){
                            System.out.print("\n\t +-------Contacto encontrado-------+");
                            contacto.mostrarContacto();

                            //Moficando contacto
                            System.out.print("\n\t (M) Nombre: ");
                            nombre= scanner.nextLine();
                            System.out.print("\n\t (M) Telefono: ");
                            telefono= scanner.nextLine();

                            //Modificamos usando setters
                            contacto.setNombre(nombre);
                            contacto.setTelefono(telefono);
                            System.out.print("\n\t +-------Contacto modificado-------+");
                            contacto.mostrarContacto();
                            banderilla=true;
                            break; //Rompo con el for inmediato
                        }
                    }

                    if(!banderilla){
                        System.out.print("\n\t Ningun contacto tiene ese id...");
                    }

                }
                case 4 -> {
                    System.out.print("\n\t Dame el id: ");
                    id_contacto = scanner.nextInt(); scanner.nextLine();

                    for(Contacto contacto : contactos) {
                        if (id_contacto == contacto.getId()) {
                            System.out.print("\n\t +-------Contacto encontrado-------+");
                            contacto.mostrarContacto();
                            contactos.remove(contacto);
                            System.out.print("\n\t +-------Contacto eliminado-------+");
                            banderilla=true;
                            break;
                        }
                    }
                    if(!banderilla){
                        System.out.print("\n\t Ningun contacto tiene ese id...");
                    }
                }
                case 5 -> {
                    System.out.print("\n\t ====> Nos vemos prontos....");
                }
            }

            System.out.print("\n\t Pulsa [ENTER] para continuar...");
            scanner.nextLine();

        }

        scanner.close();

    }

}

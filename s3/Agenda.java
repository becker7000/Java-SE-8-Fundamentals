import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        int opcion=0;
        int id_global=1;

        while (opcion!=5){


            //Ménu:
            System.out.print("\n\t +-----Agenda de contactos-----+");
            System.out.print("\n\t |  Selecciona una opción:     |");
            System.out.print("\n\t |  1) Agregar un contacto     |");
            System.out.print("\n\t |  2) Ver contactos           |");
            System.out.print("\n\t |  3) Modificar contacto      |");
            System.out.print("\n\t |  4) Eliminar contacto       |");
            System.out.print("\n\t |  5) Finalizar la agenda     |");
            System.out.print("\n\t +-----------------------------+");
            System.out.print("\n\t |||Opción => ");
            opcion= scanner.nextInt(); scanner.nextLine();

            //Variable auxiliares locales:
            String nombre="";
            String telefono="";
            int idContacto=0;
            boolean banderilla=false;

            //Aquí va la lógica de como funciona la agenda:
            switch (opcion){
                case 1 -> { //Agregar contacto:
                    System.out.print("\n\t Nombre: ");
                    nombre=scanner.nextLine();
                    System.out.print("\n\t Telefono: ");
                    telefono= scanner.nextLine();
                    Contacto contacto = new Contacto(id_global, nombre,telefono);
                    id_global++;
                    contactos.add(contacto);
                    System.out.print("\n\t Contacto guardado...");
                    contacto.mostrarContacto();
                }
                case 2 -> { //Ver contactos:
                    System.out.print("\n\t +-------------Contactos------------+");
                    if(contactos.isEmpty()){
                        System.out.print("\n\t La lista de contactos está vacía...");
                    }else{
                        for (Contacto contacto : contactos){
                            contacto.mostrarContacto();
                        }
                    }
                }
                case 3 ->{ //Modificar contacto
                    System.out.print("\n\t Dame el id: ");
                    idContacto = scanner.nextInt(); scanner.nextLine();
                    System.out.println();

                    //Busqueda secuencial:
                    for(Contacto contacto : contactos){
                        if(idContacto==contacto.getId()){
                            System.out.print("\n\t ---Contacto encontrado---");
                            contacto.mostrarContacto();

                            //Modificamos el contacto.
                            System.out.print("\n\t [M]Nombre: ");
                            nombre= scanner.nextLine();
                            System.out.print("\n\t [M]Telefono: ");
                            telefono= scanner.nextLine();

                            contacto.setNombre(nombre);
                            contacto.setTelefono(telefono);
                            System.out.print("\n\t ---Contacto modificado---");
                            contacto.mostrarContacto();

                            banderilla=true;
                            break; //Si ya fué encontrado el contacto, salimos del ciclo (64)

                        }
                    }

                    if(!banderilla){
                        System.out.print("\n\t Ningún contacto tiene ese id.");
                    }

                }
                case 4 -> {
                    System.out.print("\n\t Dame el id: ");
                    idContacto = scanner.nextInt(); scanner.nextLine();
                    System.out.println();

                    for (Contacto contacto : contactos){
                        if(idContacto==contacto.getId()){
                            System.out.print("\n\t ---Contacto encontrado---");
                            contacto.mostrarContacto();
                            contactos.remove(contacto);
                            System.out.print("\n\t ---Contacto eliminado---");
                            banderilla=true;
                            break;
                        }
                    }

                    if(!banderilla){
                        System.out.print("\n\t Ninguno contacto tiene ese id.");
                    }

                }
                case 5 -> {
                    System.out.print("\n\t ------Nos vemos pronto-------...");
                }

            }

            System.out.println("\n\t Pulsa [ENTER] para continuar...");
            scanner.nextLine();

        }

        scanner.close();

    }

}

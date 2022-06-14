import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarLista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        System.out.print("\n\t Cuantos numeros? => ");
        int cantidad = scanner.nextInt(); scanner.nextLine();

        // Algoritmo para guardar n números en el ArrayList
        for(int i=0; i<cantidad; i++){
            System.out.printf("\n\t Elemento #%d: ",(i+1));
            double num = scanner.nextDouble(); scanner.nextLine();
            lista.add(num); //Agregamos un elemento a lista
        }

        // Creamos una lista vacía:
        ArrayList<Double> listaFinal = new ArrayList<>();

        //Mientra la lista tenga elementos:
        // Algoritmo para ordenar la lista original en una lista final:
        while (!lista.isEmpty()){

            //Buscamos el elemento menor de la lista:
            double menor = lista.get(0); // Obtenemos el elemento en la posicion 0
            int indice=0;
            for (int i=0; i<lista.size(); i++){ // .size() nos da el tamaño del ArrayList
                if(menor > lista.get(i)){
                    menor = lista.get(i);
                    indice= i;
                }
            }

            //Agregamos el elemento menor a la listaFinal:
            listaFinal.add(menor);

            //Eliminamos el elemento de la lista original
            lista.remove(lista.get(indice));

        }

        // Imprimiendo la lista ordenada usando foreach:
        System.out.print("\n\n\t Lista ordenada: ");
        for (Double item : listaFinal) {
            System.out.print("\t "+item);
        }

        scanner.close();
    }

}

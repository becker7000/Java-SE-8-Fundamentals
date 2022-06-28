import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarLista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Double, Integer, etc... se les llama clase Wrapper
        ArrayList<Double> lista = new ArrayList<>();

        System.out.print("\n\t Cuantos numeros? R: ");
        int cantidad = scanner.nextInt(); scanner.nextLine();

        //Algoritmo para guardar numeros en la lista:
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("\n\t #%d: ",(i+1));
            Double num = scanner.nextDouble(); scanner.nextLine();
            lista.add(num); //Agregamos número por número a la lista
        } // Java tiene inferencia de tipos de dato double -> Double

        ArrayList<Double> listaFinal = new ArrayList<>();
        while (!lista.isEmpty()){
            double menor = lista.get(0);
            int indice=0;

            // lenght sirve para arreglos y cadenas
            // Para saber el tamaño de un ArrayList usamos size()
            for (int i = 0; i < lista.size(); i++) {
                if(menor>lista.get(i)){
                    menor= lista.get(i);
                    indice=i;
                }
            }

            listaFinal.add(menor); //Agregamos a lista
            lista.remove(lista.get(indice)); //Eliminamos un elemento de la lista

        }

        System.out.printf(" Lista ordenada: ");
        for ( double n : listaFinal) {
            System.out.print(" "+n);
        }

        scanner.close();

    }

}

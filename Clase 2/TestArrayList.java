import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

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

        //Algoritmo para encontrar el elemento menor en la lista:
        // 5.4 , 1.2 , 4.9, 10.1
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
        System.out.printf("\n\t El elemento menor es: %.2f",menor);
        System.out.printf("\n\t Su indice es: %d",indice);

        // foreach
        System.out.print("\n\t Lista: ");
        for(Double numero : lista ){
            System.out.print(" "+numero);
        }

        scanner.close();
    }

}

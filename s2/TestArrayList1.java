import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList1 {

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

        //Algoritmo para encontrar el elemento menor de la lista:
        double menor = lista.get(0); // Obtenemos el elemento en la posicion 0
        int indice=0;
        for (int i=0; i<lista.size(); i++){ // .size() nos da el tamaño del ArrayList
            if(menor > lista.get(i)){
                menor = lista.get(i);
                indice= i;
            }
        }

        System.out.printf("\n\t El valor menor es: %.2f",menor);
        System.out.printf("\n\t El índice en el que está es: %d",indice);

        scanner.close();

    }

}

/*
*  5,3,7,2,10
*
*  menor=5
*  5>3? sí
*  menor=3
*  3>7? No
*  3>2? Sí
*  menor=2
*  2>10? No
* */


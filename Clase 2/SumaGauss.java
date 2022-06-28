public class SumaGauss {

    // 1+2+3+4+...+98+99+100
    // 50*101=5050 (n+1)*n/2
    public static void main(String[] args) {

        int suma = 0; // La sumas inician en cero
        int contador=1;

        // Con while usamos condiciones más complejas
        while(contador<=100){ //Condición
            suma+=contador; //suma=suma+contador;
            contador++;
            System.out.printf("\n\t C = %d y S = %d",contador,suma);
        }

        System.out.printf("\n\t La suma del 1 al 100 es: %d",suma);

    }

}



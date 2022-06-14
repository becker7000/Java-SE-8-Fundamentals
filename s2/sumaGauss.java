public class sumaGauss {

    public static void main(String[] args) {

        // 1+2+3+4+...+100
        // (n+1)*n/2 = (100+1)*100/2 = 5050

        int contador=1; //Variable de control
        int suma=0;

        while(contador<=100){ //Condición
            suma+=contador;
            contador++; // Incremento
        }

        System.out.printf("\n\t La suma es: %d",suma);

    }

}


/*
*  Nota: Diferencia entre while y for:
*
*  Usamos while cuando sabemos en que momento
*  bajo un condición ya no se debe seguir iterando un
*  bloque de código, pero no exactamente el números de
*  veces que éste se va a iterar.
*
*  En cambio usamos for cuando sabemos el número exacto
*  de veces que se va a iterar un bloque de código.
*
* */
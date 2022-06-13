import java.util.Scanner;

public class EsVocal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n\t Escribe un letra: ");
        // char es un dato primitivo que pesa 1 byte...
        char letra = entrada.nextLine().charAt(0);

        if(letra=='a'||letra=='A'){
            System.out.println("\n\t Primer vocal");
        }else if(letra=='e'||letra=='E'){
            System.out.println("\n\t Segunda vocal");
        }else if(letra=='i'||letra=='I'){
            System.out.println("\n\t Tercer vocal");
        }else if(letra=='o'||letra=='O'){
            System.out.println("\n\t Cuarta vocal");
        }else if(letra=='u'||letra=='U'){
            System.out.println("\n\t Quinta vocal");
        }else{
            System.out.println("\n\t El simbolo no es vocal");
        }

        entrada.close();

    }

}
/*
*  1 bit es: 0 o 1 (binary digit)
*  1 byte es por ejemplo: 10101010 (8bits)
*
*  Código ASCII, el primer elemento es 0 y el último es 255.
*  Cuantos elementos hay? R: 256
*
*  Dec:     Bin:
*    0      00
*    1      01
*    2      10
*    3      11
*    4     100
*
*     ...( 1    1   1   1   1  1  1  1 ) <- 1 byte
*          128  64  32   16  8  4  2  1
*           128+32=160, 64+16=80, 8+4+2+1=15
*           160+80+15=255
*
*
*
* */


/*
*  Operador OR, es un operador binario y es infijo (que va en medio)
*
*   Tabla de verdad:
*
*   x   y  ->  x||y
*   V   V       V
*   V   F       V
*   F   V       V
*   F   F       F
*
*   Operador AND, es un operador binario y es infijo
*
*   Tabla de verdad: da verdadero ssi ambas son verdaderas
*
*   x   y  ->  x&&y
*   V   V       V
*   V   F       F
*   F   V       F
*   F   F       F
*
*  Operador NOT, es un operador unario y es prefijo.
*
*   x -> !x
*   V     F
*   F     V
*
* */
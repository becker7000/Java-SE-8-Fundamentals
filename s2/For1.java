public class For1 {

    public static void main(String[] args) {

        // Los ciclos requieren 3 elementos:
        // 1) Variable de control
        // 2) Condición de iteración
        // 3) Incremento o decremento

        // Ascendente: i=0; i<=10; i++
        // Descendente:
        for(int i=10;i>=0;i--){
            System.out.printf("\n\t i = %d",i);
        }

        // Nota: Usando el código ASCII
        System.out.print("\n\n\t Alfabeto: ");
        for(char letra='A';letra<='Z';letra++){
            System.out.printf(" %c",letra);
        }

        // Potencias de 2 del exponente 0 a 10.

        for (int i=0; i<=10; i++){
            System.out.printf("\n\t 2^%d = %d",i,(int)Math.pow(2,i));
        } //Atajo para abrir una clase nativa de Java


    }

}

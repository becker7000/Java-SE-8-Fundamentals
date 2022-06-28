public class For {

    public static void main(String[] args) {

        //Cuenta ascendente:
        System.out.print("\n\t Ascendente: ");
        for(int i=1; i<=10; i++){
            System.out.print(" "+i);
        }

        //Cuenta descendente:
        System.out.print("\n\t Descendente: ");
        for (int i = 10; i >= 1 ; i-- ) {
            System.out.print(" "+i);
        }

        //Manipulando el código ASCII:
        // HOLA -> IPMB
        System.out.print("\n\t Alfabeto: ");
        for (char letra='A'; letra<='Z'; letra++){
            System.out.print(" "+letra);
        }

        //Cifrando un mensaje con el cifrado Cesar:
        String mensaje="La clave del programa es 34o8j";
        // Códificar o cifrar -> Decodificar o decifrar
        System.out.print("\n\t Mensaje cifrado: ");
        for(int i=0;i<mensaje.length();i++){
            char letra = mensaje.charAt(i);
            System.out.printf("%c",letra+3);
        }

        //Potencias de 2 del 0 al 10:
        System.out.print("\n\t Potencias de 2 => ");
        for (int i = 0; i <=10 ; i++) {
            System.out.printf(" %d",(int)Math.pow(2,i));
        }

    }

}

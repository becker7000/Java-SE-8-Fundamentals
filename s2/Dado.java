public class Dado {

    public static void main(String[] args) {

        // 1,2,3,4,5,6
        // 0.0*6=0.0 -> 0
        // 0.2*6=1.2 -> 1
        // 0.5*6=3.0 -> 3
        // 0.9*6=5.4 -> 5
        int dado = (int)(Math.random()*6)+1;

        switch (dado){ //Duplicamos un línea con ctrl+d
            case 1 -> System.out.printf("%s",DatoTexto.UNO);
            case 2 -> System.out.printf("%s",DatoTexto.DOS);
            case 3 -> System.out.printf("%s",DatoTexto.TRES);
            case 4 -> System.out.printf("%s",DatoTexto.CUATRO);
            case 5 -> System.out.printf("%s",DatoTexto.CINCO);
            case 6 -> System.out.printf("%s",DatoTexto.SEIS);
        } //No hay default porque aseguramos un valor entre 1 y 6.

    }

}
// javac Dado.java <- compilamos
// java Dado.java <- ejecutamos
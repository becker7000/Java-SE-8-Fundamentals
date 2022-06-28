public class Dado {

    public static void main(String[] args) {

        // 0.1*6=0.6 -> 0 , 0.9*6 = 5.4 -> 5
        // 1,2,3,4,5,6
        int dado = (int)(Math.random()*6)+1;

        switch (dado){
            case 1 -> System.out.println(DatoTexto.UNO);
            case 2 -> System.out.println(DatoTexto.DOS);
            case 3 -> System.out.println(DatoTexto.TRES);
            case 4 -> System.out.println(DatoTexto.CUATRO);
            case 5 -> System.out.println(DatoTexto.CINCO);
            case 6 -> System.out.println(DatoTexto.SEIS);
        }

    }

}

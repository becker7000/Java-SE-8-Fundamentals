public class Moneda {

    public static void main(String[] args) {

        // El método random() da un Double entre 0 y 1.
        // 0.0 -> 0, 0.1 -> 0, 0.2 -> 0,...
        // 0.3*2=0.6 -> 0 , 0.6*2=1.2 -> 1
        int moneda = (int)(Math.random()*2);
        //Transformamos de double a int.

        if(moneda==0){
            System.out.printf("\n\t Moneda: %s",MonedaTexto.SOL);
        }else{
            System.out.printf("\n\t Moneda: %s",MonedaTexto.AGUILA);
        }

    }

}

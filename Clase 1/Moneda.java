public class Moneda {

    public static void main(String[] args) {

        // El método random nos da un número entre 0 y 1.
        // pero sí puede tocar el cero pero jamás el 1.
        // devuelve un número tipo double

        // Ejemplo: 0.0 -> 0, 0.4 -> 0, 0.8*2=1.6 -> 1
        int moneda= (int)(Math.random()*2);
        //Forzar al tipo de dato double a que cambie a int.

        if(moneda==0){
            System.out.println("\n\t"+MonedaTexto.SOOOOOOL);
        }else{
            System.out.println("\n\t"+MonedaTexto.ÁGUILAAA);
        }

    }

}

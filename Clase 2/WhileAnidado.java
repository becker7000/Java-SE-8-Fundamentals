public class WhileAnidado {

    public static void main(String[] args) {

        int i=0;
        int j=0;

        while(i<=5){ // Grande
            System.out.println(); //Salto de línea
            j=0;
            while(j<i){ // Chico
                System.out.print("\t*");
                j++;
            }
            i++;
        }

    }

}

/*
*  SEMANA -> CICLO:{
*  LUNES -> ciclo: 1+1+1+1+1=5
*  MARTES -> ciclo: 1+1+1+1+1=5
*  ...
*  VIERNES -> ciclo...
*  }
*
* */

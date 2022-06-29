public class Matrix {

    public static void main(String[] args) {

        // [filas][columnas]
        int[][] matrix = new int[4][4];
        System.out.print("\n\t Matriz aleatoria: ");

        // Llenando la matriz:
        for(int i=0; i< matrix.length; i++ ){ //Recorremos filas
            for (int j = 0; j < matrix[i].length; j++) { // Recorremos columnas
                matrix[i][j] = (int)(Math.random()*41)+20;
            }
        }

        // Imprimiendo la matriz:
        for(int i=0; i< matrix.length; i++ ){ //Recorremos filas
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) { // Recorremos columnas
                System.out.printf("\t %d",matrix[i][j]);
            }
        }



    }

}

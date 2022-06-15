
public class Matrix {

    public static void main(String[] args) {

        System.out.print("\n\tMatrix aleatoria de 3x3: ");

        // [filas][columnas]
        int[][] matrix = new int[3][3];

        //Llenando la matriz de números aleatorios entre 20 y 60:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)(Math.random()*41)+20;
            }
        }

        //Imprimiendo el arreglo en forma de matriz:
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("\t %d",matrix[i][j]);
            }
        }

    }

}

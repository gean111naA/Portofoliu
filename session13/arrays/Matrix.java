package ro.siit.session13.arrays;

public class Matrix {
    public static void main(String[] args) {
        // 1 2 3 [ [1] [2] [3] ]
        // 5 3 1 [ [5] [3] [1] ]
        // 6 0 1 [ [6] [0] [1] ]

        int [][] matrix = new int [4][];
        matrix[0] = new int[3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1] = new int[5];
        matrix[1][0] = 5;
        matrix[1][1] = 3;
        matrix[1][2] = 1;
        matrix[2] = new int[8];
        matrix[2][0] = 6;
        matrix[2][1] = 0;
        matrix[2][2] = 1;
        matrix[3] = new int[]{9, 4, 5, 1, 0};

        print2DMatrix(matrix);
        System.out.println();

        int[][] other = new int[][] {new int[]{1, 2, 3}, new int[]{2, 4, 6, 7}};
        print2DMatrix(other);

        String[][][][][][][][] sir = new String[2][][][][][][][];
        sir[0] = new String[3][][][][][][];

        int x = 200;
        int[] vector = {1, x, 2};
    }

    private static void print2DMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

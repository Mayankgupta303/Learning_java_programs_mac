package ex_01_Java_Basic.Arrays;

public class _2D_Array_Iterations {
    public static void main(String[] args) {
        int [] [] matrix = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " | ");

            }
            System.out.println();
        }
    }
}

package pavelpavel;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static int[][] fillMatrix(int[][] matrix, int matrixSize) {
        Random rand = new Random();

        for(int i = 0; i < matrixSize; ++i) {
            for(int j = 0; j < matrixSize; ++j) {
                matrix[i][j] = rand.nextInt(90) + 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int findMax(int[][] matrix, int matrixSize) {
        int max = matrix[1][0];
        int matrixLength = matrixSize;

        for(int i = matrixSize - 1; i > 1; --i) {
            for(int j = 0; j < matrixLength - 1; ++j) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            --matrixLength;
        }
        return max;
    }

    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            int matrixSize = in.nextInt();
            if (matrixSize > 1) {
                int[][] matrix = new int[matrixSize][matrixSize];
                fillMatrix(matrix, matrixSize);
                System.out.println(findMax(matrix, matrixSize));
            } else {
                System.out.println("Incorrect matrix");
            }
        }
    }
}

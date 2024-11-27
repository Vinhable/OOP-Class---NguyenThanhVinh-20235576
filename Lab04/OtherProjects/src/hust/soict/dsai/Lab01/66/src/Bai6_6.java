import java.util.Scanner;

public class Bai6_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chon di nguoi anh em:");
        System.out.println("1 la tu dien ma tran");
        System.out.println("2 la de toi dien ho ban nhe");
        int choice = scanner.nextInt();

        int rows = 0, columns = 0;
        int[][] matrix1 = null, matrix2 = null, sumMatrix = null;

        if (choice == 1) {
            System.out.print("So row la may: ");
            rows = scanner.nextInt();
            System.out.print("So column la may: ");
            columns = scanner.nextInt();

            matrix1 = new int[rows][columns];
            matrix2 = new int[rows][columns];
            sumMatrix = new int[rows][columns];

            System.out.println("Dien hang tu ma tran 1 di nguoi anh em:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Dien hang tu ma tran 2 di nguoi anh em:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else if (choice == 2) {
            rows = 2;
            columns = 2;
            matrix1 = new int[][] {{1, 2}, {3, 4}};
            matrix2 = new int[][] {{5, 6}, {7, 8}};
            sumMatrix = new int[rows][columns];

            System.out.println("Ma tran mau nay nguoi anh em:");
            System.out.println("Ma tran 1:");
            printMatrix(matrix1);
            System.out.println("Ma tran 2:");
            printMatrix(matrix2);
        } else {
            System.out.println("Khong co 3 dau ma doi.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nTong 2 ma tran la:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

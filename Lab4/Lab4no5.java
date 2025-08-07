import java.util.Scanner;

public class Lab4no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] firstmatrix = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                firstmatrix[i][j] = scanner.nextInt();
            }
        }

        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] secondmatrix = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                secondmatrix[i][j] = scanner.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Matrix คูณไม่ได้");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstmatrix[i][k] * secondmatrix[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
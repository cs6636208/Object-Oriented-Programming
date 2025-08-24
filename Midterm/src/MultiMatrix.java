import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int C[][] = new int[n1][n2];
        int A[][] = new int[n1][n2];
        int B[][] = new int[n1][n2];
        System.out.println("Enter the elements of first matrix : ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix : ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = A[i][j] * B[i][j];
            }
        }
        System.out.println("Resultant Matrix : ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

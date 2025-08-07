
// ข้อ 7
import java.util.Scanner;

public class Lab1no7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input x, n: ");
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int result = CalculateFunc(x, n);
        System.out.println("Output is: " + result);
        scanner.close();
    }

    public static int CalculateFunc(int x, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        return sum;
    }
}

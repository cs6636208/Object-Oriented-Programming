import java.util.Scanner;

public class Estimate {
    public static double cal(int i) {
        double mi = 0;
        for (int j = 1; j <= i; j++) {
            mi += (Math.pow(-1, j + 1) / (2 * j - 1));
        }
        return 4 * mi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(String.format("%.4f", Estimate.cal(i)));
    }
}

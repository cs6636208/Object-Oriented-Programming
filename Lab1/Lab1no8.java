// ข้อ 8

import java.util.Scanner;

public class Lab1no8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n, a0 and a1: ");
        int n = scanner.nextInt();
        int a0 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int[] a = new int[n + 1];
        a[0] = a0;
        if (n >= 1) {
            a[1] = a1;
        }
        for (int k = 2; k <= n; k++) {
            a[k] = k * k * a[k - 1] - a[k - 2] + (int) Math.pow(3, k);
        }
        System.out.print("Output is:");
        for (int i = 0; i <= n; i++) {
            System.out.print(" " + a[i]);
        }
        scanner.close();
    }
}

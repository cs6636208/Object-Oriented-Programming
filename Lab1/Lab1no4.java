
// ข้อ 4
import java.util.Scanner;

public class Lab1no4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();
        double interest = balance * (annualInterestRate / 1200);
        System.out.printf("The interest is %.5f%n", interest);
        scanner.close();
    }
}

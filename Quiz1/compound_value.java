
import java.util.Scanner;

public class compound_value {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = sc.nextDouble();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double accountValue = 0;
        for (int i = 1; i <= 6; i++) {
            accountValue = (monthlySavingAmount * accountValue) * (1 + monthlyInterestRate);
        }
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
    }
}

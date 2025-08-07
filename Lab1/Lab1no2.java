// ข้อ 2
import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the monthly saving amount: ");
       double monthlySavingAmount = input.nextDouble();
       double annualInterestRate = 0.05; 
       double monthlyInterestRate = annualInterestRate / 12;
       double accountValue = 0; 
        for (int month = 1; month <= 6; month++) {
            accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        }
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
        input.close();
    }
}


import java.util.Scanner;

class MaxPrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class MaxPrimeNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int maxPrime = Integer.MIN_VALUE;

        System.out.println("Enter numbers (0 to stop):");

        while ((number = sc.nextInt()) != 0) {
            if (MaxPrimeNumber.isPrime(number)) {
                if (number > maxPrime) {
                    maxPrime = number;
                }
            }
        }

        if (maxPrime == Integer.MIN_VALUE) {
            System.out.println("No prime numbers entered.");
        } else {
            System.out.println(maxPrime);
        }

        sc.close();
    }
}

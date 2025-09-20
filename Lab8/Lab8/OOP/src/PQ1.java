
import java.util.Scanner;

public class PQ1 {

    // เช็ค isPrime ก่อน
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int maxPrime = -1;
        while ((number = sc.nextInt()) != 0) {
            if (isPrime(number)) {
                if (number > maxPrime) {
                    maxPrime = number;
                }
            }
        }
        if (maxPrime != -1) {
            System.out.println(maxPrime);
        } else {
            System.out.println("No prime number found.");
        }
    }
}

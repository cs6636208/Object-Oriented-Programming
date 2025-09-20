
import java.util.Scanner;

public class prime {

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
        for (int i = 3; i < Math.sqrt(n); i++) {
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
        int count = 0;
        while ((number = sc.nextInt()) != 0) {
            if (isPrime(number)) {
                if (number > maxPrime) {
                    maxPrime = number;
                    count = 1;
                } else if (number == maxPrime) {
                    count++;
                }
            }
        }
        System.out.print(maxPrime + " " + count);
    }
}

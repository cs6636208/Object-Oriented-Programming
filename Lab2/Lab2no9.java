import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class MaximumPrimeNumber {
    private final PrimeChecker primeChecker;
    private final List<Integer> numbers;
    private int maxPrime;

    public MaximumPrimeNumber(List<Integer> inputNumbers) {
        this.primeChecker = new PrimeChecker();
        this.numbers = inputNumbers;
        this.maxPrime = -1;
    }

    public void findMaximumPrime() {
        for (int number : this.numbers) {
            if (primeChecker.isPrime(number) && number > this.maxPrime) {
                this.maxPrime = number;
            }
        }
    }

    public int getResult() {
        return this.maxPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputNumbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            inputNumbers.add(num);
        }
        MaximumPrimeNumber finder = new MaximumPrimeNumber(inputNumbers);
        finder.findMaximumPrime();
        System.out.println(finder.getResult());
    }
}
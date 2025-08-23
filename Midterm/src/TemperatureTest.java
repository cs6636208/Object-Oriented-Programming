import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double farenheit = scanner.nextDouble();
        double celsius = (5.0 / 9) * (farenheit - 32);
        System.out.printf("%.2f", celsius);
    }
}

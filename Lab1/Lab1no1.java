// // ข้อ 1
import java.util.Scanner;

public class TemperatureC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Farenheit : ");
        double Farenheit = scanner.nextDouble();
        double Celsius = (5.0 / 9.0) * (Farenheit - 32.0);
        System.out.printf("%.2f F = %.2f C\n", Farenheit, Celsius);
    }
}

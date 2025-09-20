
import java.util.Scanner;

public class farenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double farenheit = sc.nextDouble();
        double celcius = (5.0 / 9.0) * (farenheit - 32);
        System.out.printf("Celcius = %.2f\n", celcius);
    }

}

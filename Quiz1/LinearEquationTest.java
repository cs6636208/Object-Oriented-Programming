
import java.util.Scanner;

class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        if (a * d - b * c != 0) {
            return true;
        }
        return true;
    }

    public double getX() {
        double x = ((e * d - b * f) / (a * d - b * c));
        return x;
    }

    public double getY() {
        double y = ((a * f - e * c) / (a * d - b * c));
        return y;
    }

}

public class LinearEquationTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.printf("x is %.1f and y is %.1f\n", linearEquation.getX(), linearEquation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}

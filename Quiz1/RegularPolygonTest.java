
class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        double area = (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
        return area;
    }
}

public class RegularPolygonTest {

    public static void main(String[] args) {
        RegularPolygon regu1 = new RegularPolygon();
        RegularPolygon regu2 = new RegularPolygon(6, 4);
        RegularPolygon regu3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Perimeter 1 : " + regu1.getPerimeter() + " Area 1 : " + regu1.getArea());
        System.out.println("Perimeter 2 : " + regu2.getPerimeter() + " Area 2 : " + regu2.getArea());
        System.out.println("Perimeter 3 : " + regu3.getPerimeter() + " Area 3 : " + regu3.getArea());
    }
}

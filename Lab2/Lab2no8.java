class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    // Default constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.x = 0;
    }

    // Constructor with n and side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // Constructor with n, side, x, and y
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getN() {
        return this.n;
    }

    public double getSide() {
        return this.side;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Setters
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

    // Methods to calculate perimeter and area
    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }
}

public class Lab2no8 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(
                "Polygon1 Perimeter : " + regularPolygon1.getPerimeter() + " Area : " + regularPolygon1.getArea());
        System.out.println(
                "Polygon2 Perimeter : " + regularPolygon2.getPerimeter() + " Area : " + regularPolygon2.getArea());
        System.out.println(
                "Polygon3 Perimeter : " + regularPolygon3.getPerimeter() + " Area : " + regularPolygon3.getArea());
    }
}

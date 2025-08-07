package Lab6;

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    /** Default constructor */
    protected GeometricObject() {
    }

    /** Convenience constructor */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double findArea();

    public abstract double findPerimeter();
}

public class Circle extends GeometricObject {
    private double radius;

    /** Default constructor */
    public Circle() {
        this(1.0);
    }

    /** Radius convenience constructor */
    public Circle(double radius) {
        this(radius, "white", false);
    }

    /** Convenience constructor for all properties */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Return the radius
     * 
     * @return radius Current radius of Circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of the current circle
     * Implemention of abstract method in GeometricObject
     * 
     * @return area of the circle
     */
    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Returns the perimeter of the current circle
     * Implemention of abstract method in GeometricObject
     * 
     * @return perimeter of the circle
     */
    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Provide a string representation of the object
     */
    @Override
    public String toString() {
        return "Circle: radius = " + radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0, "blue", true);
        System.out.println(c.toString());
        System.out.println("Area: " + c.findArea());
        System.out.println("Perimeter: " + c.findPerimeter());
        System.out.println("Color: " + c.getColor());
        System.out.println("Filled: " + c.isFilled());
    }
}

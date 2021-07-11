package class_object.oop_geometric;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
//		super(color, filled);
        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

//	public void printCircle() {
//		System.out.println("The circle is created " + getDateCreate() + " and the radius is " + radius);
//	}

    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

}

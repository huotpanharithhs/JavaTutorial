package class_object;

public class Circle {
    double radius = 1;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle cir1 = new Circle(10);
        Circle cir2 = new Circle();
        cir2.setRadius(1.2);
        System.out.println("Radius Cir1: " + cir1.radius + " Area Cir1: " + cir1.getArea() + " Perimeter Cir1: " + cir1.getPerimeter());
        System.out.println("Radius Cir2: " + cir2.radius + " Area Cir2: " + cir2.getArea() + cir2.getPerimeter());
    }

}

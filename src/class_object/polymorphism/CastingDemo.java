package class_object.polymorphism;

import class_object.oop_geometric.Circle;
import class_object.oop_geometric.Rectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1.2);
        Object object2 = new Rectangle(1.2, 2.0);
        displayObject(object1);
        displayObject(object2);

    }
    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle Area :" + ((Circle) object).getArea());
        }
        if (object instanceof Rectangle) {
            System.out.println("The Rectangle Area: " + ((Rectangle) object).getArea());
        }
    }
}

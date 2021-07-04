package oop_abstraction;

public class AbstractMainGeometric {

	public static void main(String[] args) {
		AbstractGeometric circle = new AbstractCircle(1, "Red", true);
		AbstractGeometric rectangle = new AbstractRectangle(1, 2, "Red", true);
		System.out.println(equalArea(circle, rectangle));
	}

	public static boolean equalArea(AbstractGeometric obj1, AbstractGeometric obj2) {
		return obj1.getArea() == obj2.getArea();
	}

	public static boolean equalPerimeter(AbstractGeometric obj1, AbstractGeometric obj2) {
		return obj1.getPerimeter() == obj2.getPerimeter();
	}

	public static void displayGeometricObject(AbstractGeometric obj) {
		System.out.println("The area: " + obj.getArea());
		System.out.println("The perimeter: " + obj.getPerimeter());
	}
}

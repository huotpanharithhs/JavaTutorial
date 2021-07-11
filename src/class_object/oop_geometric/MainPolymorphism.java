package class_object.oop_geometric;

public class MainPolymorphism {

	public static void main(String[] args) {
		displayObject(new Circle(1.2, "White", true));
		displayObject(new Rectangle(2, 1.3, "Red", true));
	}

	public static void displayObject(GeometricObject geometric) {
		System.out.println("Created on " + geometric.getDateCreated() + ". Color is " + geometric.getColor()+"\n"+geometric.toString());
	}
}

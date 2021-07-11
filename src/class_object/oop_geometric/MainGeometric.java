package class_object.oop_geometric;

public class MainGeometric {

	public static void main(String[] args) {
		Circle cirlce = new Circle(2, "Blue", true);
		System.out.println(cirlce.toString());
		System.out.println(cirlce.getArea());
	}

}

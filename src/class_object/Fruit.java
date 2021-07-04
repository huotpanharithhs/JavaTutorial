package class_object;

public class Fruit {
	private String color;
	private String name;

	protected Fruit(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Fruit apple = new Fruit("Red", "Apple");
		Fruit banana = new Fruit("Yello", "Banana");
		Fruit mango = new Fruit("Green", "Mango");
		System.out.println("Name: " + apple.getName() + "\nColor:" + apple.getColor());
		System.out.println("Name: " + banana.getName() + "\nColor:" + banana.getColor());

	}

}

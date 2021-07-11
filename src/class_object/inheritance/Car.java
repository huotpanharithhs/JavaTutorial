package class_object.inheritance;

public class Car {

	private String name;
	private String color;

	public Car() {
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Car name:" + name + " Color:" + color;
	}
	public static void main(String[] args) {
		Car volvo = new Car();
		Car toyota = new Car();
		Car audi = new Car();
		toyota.setName("Toyota");
		toyota.setColor("Light-Green");
		volvo.setColor("Black");
		volvo.setName("Volvo");
		audi.setName("Audi");
		audi.setColor("Pink");
		System.out.println(toyota.toString());
		System.out.println(volvo.toString());
		System.out.println(audi.toString());
		
	}

}

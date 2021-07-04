package oop_geometric;

public class Rectangle extends GeometricObject {
	private double height, width;

	public Rectangle() {
	}

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Rectangle(double height, double width, String color, boolean filled) {
//		super(color, filled);
		this.height = height;
		this.width = width;
		setColor(color);
		setFilled(filled);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public void printRectangle() {
		System.out.println(
				"The rectangle is created " + getDateCreated() + " and  width: " + width + " height: " + height);
	}

}

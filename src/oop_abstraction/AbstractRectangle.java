package oop_abstraction;

public class AbstractRectangle extends AbstractGeometric {

	private double width;
	private double height;

	public AbstractRectangle() {
	}

	public AbstractRectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	@Override
	protected double getArea() {
		return width * height;
	}

	@Override
	protected double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return super.toString() + "\nwidth: " + width + "\nheight: " + height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}

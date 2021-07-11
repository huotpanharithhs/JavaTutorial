package class_object.oop_abstraction;

public class AbstractCircle extends AbstractGeometric {

	private double radius;

	public AbstractCircle() {
	}

	public AbstractCircle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	protected double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	protected double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius = " + radius;
	}
}

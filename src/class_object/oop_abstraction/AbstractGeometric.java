package class_object.oop_abstraction;

import java.util.Date;

public abstract class AbstractGeometric {

	private String color;
	private boolean filled;
	private Date dateCreate;

	protected AbstractGeometric() {
		dateCreate = new Date();
	}

	protected AbstractGeometric(String color, boolean filled) {
		super();
		dateCreate = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public String toString() {
		return "created on " + dateCreate + "\ncolor: " + color + " and filled: " + filled;
	}

	protected abstract double getArea();

	protected abstract double getPerimeter();
}

package oop_geometric;

import java.util.Date;

public class GeometricObject {

	private String color;
	private boolean filled;
	private Date dateCreate;

	public GeometricObject() {
		dateCreate = new Date();
	}

	public GeometricObject(String color, boolean filled) {
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

	public Date getDateCreated() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public String toString() {
		return "created on " + dateCreate + "\ncolor: " + color + " and filled: " + filled;
	}
}

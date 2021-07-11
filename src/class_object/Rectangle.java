package class_object;

public class Rectangle {
    private double width, height;
    private String color;

    public Rectangle() {
        this(0, 0, "white");
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            return;
        }
        System.out.println("Width must bigger than zero.");

    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            return;
        }
        System.out.println("Height must bigger than zero.");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        if (width > 0 && height > 0) {
            return width * height;
        }
        return 0;
    }

    public double getPerimeter() {
        if (width > 0 && height > 0) {
            return 2 * (width + height);
        }
        return 0;
    }
}

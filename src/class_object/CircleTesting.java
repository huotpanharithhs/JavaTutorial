package class_object;

public class CircleTesting {
    private double mRadius = 0;

    public CircleTesting() {
        this.mRadius = 0;
    }

    public CircleTesting(double mRadius) {
        this.mRadius = mRadius;
    }

    public double getArea() {
        if (this.mRadius > 0)
            return mRadius * mRadius * Math.PI;
        System.out.println("Can't calculate Area.");
        return 0;
    }

    public double getPerimeter() {
        if (this.mRadius > 0)
            return 2 * mRadius * Math.PI;
        System.out.println("Can't calculate perimeter.");
        return 0;
    }

    public double getmRadius() {
        return mRadius;
    }
    public void setmRadius(double mRadius) {
        if (mRadius > 0) {
            this.mRadius = mRadius;
            return;
        }
        System.out.println("Radius must greater than Zero.");
    }
}

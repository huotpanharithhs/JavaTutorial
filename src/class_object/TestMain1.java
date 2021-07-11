package class_object;

import class_object.Test;

import java.util.Scanner;

public class TestMain1 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(1.2, 1.4, "Red");
//        System.out.println((rec1.getArea() == 0) ? "Width and Height must bigger than zero" : ("Area: "+rec1.getArea()) + "\nColor :" + rec1.getColor());
        if (0 == rec1.getArea()) {
            System.out.println("Width and Height must bigger than zero");
        } else {
            System.out.println(("Area: " + rec1.getArea()) + "\nColor :" + rec1.getColor());
        }
    }
}

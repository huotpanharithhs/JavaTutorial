package class_object.polymorphism;

public class Main {
    public static void main(String[] args) {
        displayObject(new GraduateStudent());
        displayObject(new Students());
        displayObject(new Person());
        displayObject(new Object());
    }

    public static void displayObject(Object obj) {
        System.out.println(obj.toString());
    }
}

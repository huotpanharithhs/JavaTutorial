package class_object.inheritance;

public class TestModifier {
    public static void displayClass(){
        System.out.println("This is method of class.");
    }
    public void displayObject(){
        System.out.println("This is method of object.");
    }

    public static void main(String[] args) {
        TestModifier obj = new TestModifier();
        obj.displayObject();
        TestModifier.displayClass();
    }
}

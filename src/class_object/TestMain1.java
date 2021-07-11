package class_object;

import class_object.Test;

public class TestMain1 {
    public static void main(String[] args) {
        Test.myMethod();
        int value = Test.myMethod1();
        System.out.println(value);

        String province[] ={"KC","SR","BTB"};
        Test.main(province);
        System.out.println("Invoke method main1 by object.");
        Test obj = new Test();
        obj.main1(province);
    }
}

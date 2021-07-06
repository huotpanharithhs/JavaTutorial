package procudure.simple;

public class Caculator {
    static int sum(int a , int b){ //sum(1,2)
        return a+b; //3
    }
    public static void main(String[] args) {
        int s = sum(4,5);
        System.out.println(sum(4,6));
        System.out.println(sum(10,20));
        System.out.println(sum(2,3));

    }
}

package class_object;

public class Test {
    public static void myMethod(){
        System.out.println("Hello!");
    }
    public static int myMethod1(){
        System.out.println("Hello!");
        return 10;
    }
    public void main1(String[] args){
        for(int i = 0 ; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
    public static void main(String[] args) {
        for(int i = 0 ; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}

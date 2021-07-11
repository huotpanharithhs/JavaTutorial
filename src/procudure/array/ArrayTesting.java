package procudure.array;

import java.util.ArrayList;

public class ArrayTesting {
    public static void main(String[] args) {
//        double[] myList = new double[10];
//        for(int i = 0 ; i < 10 ; i++){
//            myList[i] = i;
//        }
//        for(double i : myList){
//            System.out.println(i);
//        }

        ArrayList<Double> list = new ArrayList<Double>();
        for(double i = 0 ; i<20; i++){
            list.add(i);
        }
        for(double i : list){
            System.out.println(i);
        }
    }
}

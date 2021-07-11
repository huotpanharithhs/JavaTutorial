package procudure.loop;

public class SumN {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 1000){
            sum += i;   //sum = sum+i;
            i++;  // = i+1
        }
        System.out.println(sum);
    }
}

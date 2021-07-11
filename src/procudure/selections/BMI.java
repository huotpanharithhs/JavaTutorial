package procudure.selections;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("បញ្ចូល BMI :");
        double bmi;
        Scanner input = new Scanner(System.in);
        bmi = input.nextDouble();
        if(bmi<18.5) {
            System.out.println("មិនគ្រប់ទម្ងន់");
        }else if(bmi<25.0){
            System.out.println("ធម្មតា");
        }else if(bmi < 30.0){
            System.out.println("ធាត់");
        }else{
            System.out.println("ធាត់ហួស");
        }
    }
}

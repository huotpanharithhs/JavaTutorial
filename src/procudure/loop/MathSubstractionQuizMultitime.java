package procudure.loop;

import java.util.Scanner;

public class MathSubstractionQuizMultitime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int i = 0;
        int correct = 0;
        int wrong = 0;
        while (i < 10) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer == (number1 - number2)) {
                System.out.println("Your answer correct!");
                correct++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
                wrong++;
            }
            i++;
        }
        long stopTime = System.currentTimeMillis();
        long resultTime = stopTime - startTime;
        long second = resultTime / 1000;
        long minute = second / 60;
        long resultSecond = second % 60;
        System.out.println("អ្នកឆ្លើយត្រូវចំនួន "+ correct +"សំណួរ និងឆ្លើយខុសចំនួន "+ wrong+"សំណួរ");
        System.out.println("អ្នកចំណាយពេល " + minute + " នាទី " + resultSecond + "វិនាទី");
    }
}

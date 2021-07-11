package procudure.selections;

import java.util.Scanner;

public class GuessDay {
    public static void main(String[] args) {
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("បញ្ចូលលេខ: ");
        day = input.nextInt();
        switch (day%12) {
            case 1:
                System.out.println("ថ្ងៃចន្ទ");
                break;
            case 2:
                System.out.println("ថ្ងៃអង្គា");
                break;
            case 3:
                System.out.println("ថ្ងៃពុធ");
                break;
            case 4:
                System.out.println("ថ្ងៃព្រហស្បតិ៍");
                break;
            case 5:
                System.out.println("ថ្ងៃសុក្រ");
                break;
            case 6:
                System.out.println("ថ្ងៃសៅរ៍");
                break;
            case 7:
                System.out.println("ថ្ងៃអាទិត្យ");
                break;
            default:
                System.out.println("បញ្ចូលលេខនៅចន្លោះ [1,7]");
        }
    }
}

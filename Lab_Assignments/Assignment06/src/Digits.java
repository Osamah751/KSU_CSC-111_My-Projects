
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int num, number, j;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number (-1 to end): ");
        num = kb.nextInt();
        j = 1;

        while (num != -1) {
            while (num > 0){
                number = num % 10;
                System.out.println("Digit" + j++ + " = " + number);
                num = num/10;
            }//while (num > 0)
            System.out.print("Enter a number: ");
            num = kb.nextInt();
            j = 1;
        }//while (num != -1)
    }//main
}//class

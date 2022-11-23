
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int num;
        boolean devisibleBy5Or6, devisibleBy5And6;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num = kb.nextInt();

        System.out.print("Is " + num + " divisible by 5 and 6? ");
        devisibleBy5And6 = ((num % 5 == 0) && (num % 6 == 0));
        System.out.println(devisibleBy5And6);

        System.out.print("Is " + num + " divisible by 5 or 6? ");
        devisibleBy5Or6 = ((num % 5 == 0) || (num % 6 == 0));
        System.out.println(devisibleBy5Or6);

        System.out.print("Is " + num + " devisible by 5 or 6, but not both? ");
        if (devisibleBy5Or6 && !(devisibleBy5And6)){
            System.out.println("true");
        } else {System.out.println("false");}
    }
}

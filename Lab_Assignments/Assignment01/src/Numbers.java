/* This is the 1st_assignment_Part01 for the course [CSC 111] From KSU */

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num1, num2, num3, sum, mult;
        double avr, pow;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        num3 = kb.nextInt();

        sum = num1 + num2 + num3;
        mult = num1 * num2 * num3;
        avr = sum / 3.0;
        pow = Math.pow(num1, num2);

        System.out.println("Sum = " + sum);
        System.out.println("Mult = " + mult);
        System.out.println("Avr = " + avr);
        System.out.println("Pow = " + pow);
    }
}

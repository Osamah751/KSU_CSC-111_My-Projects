/* This is the 2nd_assignment_Part01 for the course [CSC 111] From [KSU] */

import java.util.Scanner;

public class MinsToYearsDays {
    public static void main(String[] args) {
        int min_in, years_out, days_out, temp;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        min_in = kb.nextInt();

        temp = min_in / (60*24);
        years_out = temp / 365;
        days_out = temp % 365;

        System.out.println(min_in + " minutes is approximately " + years_out + " years and " + days_out + " days");


    }
}

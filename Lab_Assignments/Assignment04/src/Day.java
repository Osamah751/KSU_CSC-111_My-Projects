
import java.util.Scanner;

public class Day {
    public static void main(String[] args){
        int year, m, q, h, j, k;
        String dayOfWeek="";

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        year = kb.nextInt();

        System.out.print("Enter month: 1-12: ");
        m = kb.nextInt();

        // converting Jan and Feb to 13 and 14 respectively and changing the year to previous year.
        if (m == 1){m=13;year--;}
        if (m == 2){m=14;year--;}

        System.out.print("Enter the day of the month: 1-31: ");
        q = kb.nextInt();

        j = year /100;
        k = year % 100;
        h = (q + (26*(m+1)/10) + k + (k/4) + (j/4) + (5*j) ) % 7;

        switch(h){
            case 0:
                dayOfWeek = "Saturday";
                break;
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
        }//switch

        System.out.println("Day of the week is " + dayOfWeek);
    }
}

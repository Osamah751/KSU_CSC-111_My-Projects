
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        int amount, interestRate, months;
        double accountValue, interestRatePerYear;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the amount to be saved for each month: ");
        amount = kb.nextInt();

        System.out.print("Enter the annual interest rate: ");
        interestRate = kb.nextInt();

        System.out.print("Enter the number of months: ");
        months = kb.nextInt();

        accountValue=0;
        interestRatePerYear = (interestRate/100.0) /12.0;
        for (int i=0; i<months; i++){
            accountValue = (amount + accountValue) * ( 1 + interestRatePerYear );
        }//for loop

        System.out.println("After the " + months + "th month, the account value is " + accountValue);
    }//main
}//class

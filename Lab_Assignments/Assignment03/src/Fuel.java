/* This is the 3rd_assignment_Part01 for the course [CSC 111] From [KSU] */

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        double distance, kmToLiters, literPrice, totalLiters, cost;

        Scanner kb = new Scanner(System.in);

        // [Section] Input
        System.out.print("Enter the driving distance: ");
        distance = kb.nextDouble();

        System.out.print("Enter kilos per liter: ");
        kmToLiters = kb.nextDouble();

        System.out.print("Enter price per liter: ");
        literPrice = kb.nextDouble();

        // Calculating the number of liters needed then multiplying it by the cost of a single liter
        totalLiters = distance / kmToLiters;
        cost = totalLiters * literPrice;


        System.out.println("The cost of driving is $" + cost);
    }
}

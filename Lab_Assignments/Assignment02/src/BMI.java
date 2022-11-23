/* This is the 2nd_assignment_Part02 for the course [CSC 111] From [KSU] */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        double bmi, weight_pounds, weight_kg, height_inches, height_meters;

        Scanner kb = new Scanner(System.in);

        // Taking input from the User
        System.out.print("Enter weight in pounds: ");
        weight_pounds = kb.nextDouble();

        System.out.print("Enter height in inches: ");
        height_inches = kb.nextDouble();

        // Converting to SI Units
        weight_kg = weight_pounds * 0.45359237;
        height_meters = height_inches * 0.0254;

        // Calculating BMI
        bmi = weight_kg / Math.pow(height_meters, 2);

        System.out.println("BMI is " + bmi);
    }
}

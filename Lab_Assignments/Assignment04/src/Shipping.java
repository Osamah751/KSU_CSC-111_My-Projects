
import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        int shippingWeight;
        double cost = 0;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter package weight: ");
        shippingWeight = kb.nextInt();

        if (shippingWeight > 20){
            System.out.println("the package cannot be shipped.");
        } else {
            if ( (shippingWeight > 0) && (shippingWeight <= 1) ) {
                cost = 3.5;
            } else if ( (shippingWeight > 1) && (shippingWeight <= 3) ) {
                cost = 5.5;
            } else if ( (shippingWeight > 3) && (shippingWeight <= 10) ) {
                cost = 8.5;
            } else if ( (shippingWeight > 10) && (shippingWeight <= 20) ) {
                cost = 10.5;
            }

            System.out.println("The Shipping cost is $" + cost);
        }//else END

    } //main END
}//Class END

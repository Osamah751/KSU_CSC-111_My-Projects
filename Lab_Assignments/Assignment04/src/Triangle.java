
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int edge1, edge2, edge3;
        double perimeter;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter three edges (length in double): ");
        edge1 = kb.nextInt();
        edge2 = kb.nextInt();
        edge3 = kb.nextInt();

        if ( (edge1+edge2 < edge3) || (edge2+edge3 < edge1) || (edge1+edge3 < edge2) ) {
            System.out.println("Input is invalid");
        } else {
            perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        }
    }
}

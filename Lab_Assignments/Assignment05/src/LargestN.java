
import java.util.Scanner;

public class LargestN {
    public static void main(String[] args){
        int x, n;

        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter x: ");
        x = kb.nextInt();

        n = (int) Math.floor(Math.pow(x,1/3.0));
        System.out.println("n=" + n);
    }//main
}//class

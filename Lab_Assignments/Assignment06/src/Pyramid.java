
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        int line;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        line = kb.nextInt();

        for (int i=1; i<=line; i++) {

            for (int j=0; j<=(line-i); j++) {
                if (j == (line - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }// if-else
            }// for j<=(line-i)


            for (int j=i; j>=1; j--) {
                if (i == 1) {
                    System.out.print(j);
                } else{
                    System.out.print(j + "  ");
                }// if-else (i == 1)
            }// for j>=1


            for (int j=2; j<i+1; j++) {
                if (j==i){
                    System.out.print(j);
                } else {
                    System.out.print(j + "  ");
                }// if-else (j==i)
            }// for j<i+1


            System.out.println();
        }// for i<=line
    }//main
}//class

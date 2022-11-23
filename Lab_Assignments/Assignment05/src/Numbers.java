
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int n1, n2, smallNum, bigNum, currentNum, counter;

        Scanner kb = new Scanner(System.in);

        System.out.print("Please anter two integer numbers n1, n2: ");
        n1 = kb.nextInt();
        n2 = kb.nextInt();

        if (n1<n2){
            smallNum = n1;
            bigNum = n2;
        } else {
            smallNum = n2;
            bigNum = n1;
        }//else

        currentNum = smallNum;
        counter = 1;
        while(currentNum <= bigNum){
            if ( (currentNum % 5 == 0) || (currentNum % 6 == 0) ){
                if ( (currentNum % 5 != 0) || (currentNum % 6 != 0) ){

                    if (counter == 1){
                        System.out.print(currentNum);
                    } else if (counter < 10){
                        System.out.print(", " + currentNum);
                    } else{
                        System.out.print(", " + currentNum);
                        System.out.print("\n");
                        counter = 0;
                    }//if

                    counter++;
                }// if (number is not divisible by both 5 and 6)
            }//if (number  divisible by 5 or 6)
            currentNum++;
        }//while

    }//main
}//class


import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int counter, currentScore;
        double topScore;
        String topStudent, currentStudent;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        counter = kb.nextInt();

        topStudent = "";
        topScore = 0;

        for (int i=1; i <= counter; i++){
            System.out.print("Enter a student name: ");
            currentStudent = kb.next();

            System.out.print("Enter a student name: ");
            currentScore = kb.nextInt();

            if (currentScore > topScore){
                topScore = currentScore;
                topStudent = currentStudent;
            }//if
        }//for loop

        System.out.println("Top student " + topStudent + "'s score is " + topScore);

    }//Main
}//Class

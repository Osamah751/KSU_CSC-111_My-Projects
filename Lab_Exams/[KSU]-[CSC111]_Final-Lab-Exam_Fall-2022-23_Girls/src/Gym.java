import java.util.Scanner;

public class Gym {
    public static void main(String[] args){

        // 1
        FitnessCourse f1 = new FitnessCourse("swimming", 15);
        FitnessCourse f2 = new FitnessCourse("boxing", 10);
        FitnessCourse f3 = new FitnessCourse("yoga", 6);

        // 2
        Trainee t1 = new Trainee("Maha Saad", 60, 'F');
        f1.addTrainee(t1);
        System.out.println("The trainee is added successfully to swimming");

        Trainee t2 = new Trainee("Malak Ali", 52, 'F');
        f1.addTrainee(t2);
        System.out.println("The trainee is added successfully to swimming");

        Trainee t3 = new Trainee("Hala Mohammed", 88, 'F');
        f1.addTrainee(t3);
        System.out.println("The trainee is added successfully to swimming");


        // 3
        f1.display();

        // 4
        System.out.println("The income for f1 is: " + f1.calculateIncome());

        // 5
        Scanner kb = new Scanner(System.in);

        System.out.println("Name:");
        String t4Name = kb.nextLine();

        System.out.println("Wight");
        int t4w = kb.nextInt();

        System.out.println("Sex:");
        char t4s = kb.next().charAt(0);

        while ( (t4s != 'F') && (t4s != 'M') ){
            System.out.println("Wrong entry, it should be M or F. Try again.");
            t4s = kb.next().charAt(0);
        }
        Trainee t4 = new Trainee(t4Name, t4w, t4s);
        f2.addTrainee(t4);


        // 6
        f2.display();

        // 7
        Trainee t5 = new Trainee("Gus Fring", 77, 'M');
        f3.addTrainee(t5);
        System.out.println("The trainee is added successfully to swimming");

        Trainee t6 = new Trainee("Kim Wex", 59, 'F');
        f3.addTrainee(t6);
        System.out.println("The trainee is added successfully to swimming");

        // 8
        f3.display();

        //9
        f3.addTrainee(t6);

        // 10
        System.out.println("The number of Female members in the gym is " + Trainee.numOfFemale);

        // 11
        System.out.println (" Income for F2 and f3 : " + calcuTotlIncome(f2,f3));
    }


        public static double calcuTotlIncome(FitnessCourse fc1 , FitnessCourse fc2)
        {
            return fc1.calculateIncome() + fc2.calculateIncome();
        }


}

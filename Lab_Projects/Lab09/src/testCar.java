import java.util.Scanner;

public class testCar {
    public static void main(String[] args){

        // 1
        Car car1 = new Car();
        Car car2 = new Car();

        // 2
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter car1 model, year, mileage, hadd and soom");
        car1.setModel(kb.next());
        car1.setYear(kb.nextInt());
        car1.setMileage(kb.nextInt());
        car1.setHadd(kb.nextDouble());
        car1.setSoom(kb.nextDouble());

        System.out.println("Please enter car2 model, year, mileage, hadd and soom");
        car2.setModel(kb.next());
        car2.setYear(kb.nextInt());
        car2.setMileage(kb.nextInt());
        car2.setHadd(kb.nextDouble());
        car2.setSoom(kb.nextDouble());

        // 3
        car1.printCar();
        car2.printCar();

        // 4
        if (car1.similar(car2)){
            System.out.println("Cars are similar");
        } else {
            System.out.println("Cars are not similar");
        }

        // 5
        do{
            System.out.println("Please enter your soom (the difference between soom and hadd must be less that " + car1.getHadd()*0.02);
            car1.setSoom(kb.nextDouble());
        } while(car1.difference()<= (car1.getHadd()*0.02));

        //6
        car1.printCar();
        car2.printCar();


    }

}

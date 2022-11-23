public class FitnessCourse {
    private String name, members; // name = course name ; members = names of all members in the course
    private int num, numOfOW, capacity;

    public FitnessCourse(String n, int capa) {
        this.name = n;
        capacity = capa;
    }


    public boolean addTrainee(Trainee t){

        // 1
        if (isFull()){return false;}


        // 2
        if (isMember(t)){return false;}

        // 3
        members = members + name;

        // 4
        num++;

        // 5
        if (t.getWeight()>80)
            numOfOW++;

        return true;
    }

    //--------------------------------------------------------------------------------------------------------------
    public boolean isMember(Trainee t) {
        String nameOfTrainee = t.getName();
        int k = 0;
        int j = 0;
        for (int i = 0; i < members.length(); i++) {
            char ch = members.charAt(i);
            if (ch == nameOfTrainee.charAt(j)) {
                j++;
                k = members.indexOf(ch);
                if (members.substring(k).length() == nameOfTrainee.length()) {
                    if (members.substring(k, k + nameOfTrainee.length()).equals(nameOfTrainee))
                        if (t.getSex() == 'F')
                            Trainee.numOfFemale--;
                    return true;
                }
            }
        }
        return false;
    }
//--------------------------------------------------------------------------------------------------------------

    public boolean isFull(){
        if (num >= capacity){
            return true;
        } else {
            return false;
        }
    }


    public double calculateIncome(){
        double totalIncome=0;

        switch (name){
            case ("swimming"):
                totalIncome+= ( 100*(num-numOfOW) ) + (100*0.5*(numOfOW));
                break;
            case ("boxing"):
                totalIncome+= ( 120*(num-numOfOW) ) + (120*0.5*(numOfOW));
                break;
            case ("yoga"):
                totalIncome+= ( 170*(num-numOfOW) ) + ( 170*0.5*(numOfOW) );
                break;
        }
        return totalIncome;
    }


    public void display(){
        System.out.println("Name:                    " + name);
        System.out.printf("Name:%20s%nCapacity%10f%n", name, capacity);
        System.out.println("Capacity:          " + capacity);

        System.out.println("Trainee name:");
        // name converter from one huge string to many smaller ones

        for (int i = 0; i>=(name.length()); i++)
            if (name.charAt(i)==','){System.out.print("\n");}
            else {System.out.print(name.charAt(i));}

        System.out.print("Availability:");
        if (isFull()){
            System.out.println("This course is full");
        } else {
            System.out.println("You can book this course");
        }

        System.out.println("*************************************");
    }


}

// things to review
// add method
//

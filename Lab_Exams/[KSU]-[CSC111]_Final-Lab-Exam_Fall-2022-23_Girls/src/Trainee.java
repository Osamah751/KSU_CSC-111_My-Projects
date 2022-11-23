public class Trainee {
    private String name, courseName="";
    private double weight;
    private char sex;
    public static int numOfFemale;

    public Trainee(String name, double w, char sex) {
        this.name = name;
        weight = w;
        if (w<0){w = Math.abs(w);}
        this.sex = sex;

        if (sex == 'F'){numOfFemale++;}
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public char getSex() {
        return sex;
    }
}

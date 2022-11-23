public class Car {
    private String model;
    private int year, mileage;
    private double soom, hadd;



    public Car(){}

    public Car(String model, int year, int mileage, double soom, double hadd) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.soom = soom;
        this.hadd = hadd;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setSoom(double soom) {
        this.soom = soom;
    }

    public void setHadd(double hadd) {
        this.hadd = hadd;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getSoom() {
        return soom;
    }

    public double getHadd() {
        return hadd;
    }

    public boolean similar(Car c){
        if ( (this.model == c.model) && (this.year == c.year) && ( Math.abs(this.mileage - c.mileage ) <10000 ) ){ //same model, year, 10 milage)
            return true;
        } else {return false;}
    }

    public double difference(){
        return (hadd - soom);
    }

    public void printCar(){
        System.out.println("This car is a " + model + " and was made in " + year);
        System.out.println("It has " + mileage + " KM and soom is " + soom + " Hadd is " + hadd);

    }
}

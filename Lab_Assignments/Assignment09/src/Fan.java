public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public int speed = SLOW;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";
    private String status = "off";


    public void turnOn() {
        on = true;
        status = "on";
    }//turnOn()


    public void turnOff() {
        on = false;
        status = "off";
    }//turnOff()


    public void increaseSpeed() {
        if (speed == FAST) {
            System.out.println("Fan is already running at highest speed.");
        } else if (speed == MEDIUM) {
            speed = FAST;
        } else {
            speed = MEDIUM;
        }//if-if-else
    }//increaseSpeed


    public void decreaseSpeed() {
        if (speed == SLOW) {
            System.out.println("Fan is already running at lowest speed.");
        } else if (speed == MEDIUM) {
            speed = SLOW;
        } else {
            speed = FAST;
        }//if-if-else
    }//decreaseSpeed()


    public void changeSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = FAST;
        }//switch

        if (speed > 3 || speed < 1) {
            System.out.println("Incorrect speed value");
        }//if
    }//changeSpeed()


    public void changeColor(String color) {
        this.color = color;
    }//changeColor()

    public void changeRadius(double radius) {
        this.radius = radius;
    }//changeRadius()


    public String toString() {
        return "speed " + speed + "\ncolor " + color + "\nradius " + radius + "\nfan is " + status;
    }//toString()


}//class

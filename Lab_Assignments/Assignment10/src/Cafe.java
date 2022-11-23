public class Cafe {
    private double coffeePrice;
    private double teaPrice;
    private double donutPrice;
    private int coffeeTotQty;
    private int teaTotQty;
    private int donutTotQty;
    private double discount;
    private double subtotal;
    private double discountedPrice;
    private double total;

    public Cafe() {
    }//Cafe()

    public Cafe(double cofp, double teap, double donp, int cofq, int teaq, int donq, double dis) {
        setCoffeePrice(cofp);
        setTeaPrice(teap);
        setDonutPrice(donp);
        setCoffeeTotQty(cofq);
        setTeaTotQty(teaq);
        setDonutTotQty(donq);
        setDiscount(dis);
    }//Cafe(cofp, teap, donp, cofq, teaq, dong, dis)

    public double getCoffeePrice() {
        return coffeePrice;
    }//getCoffeePrice()

    public double getTeaPrice() {
        return teaPrice;
    }//getTeaPrice()

    public double getDonutPrice() {
        return donutPrice;
    }//getDonutPrice()

    public int getCoffeeTotQty() {
        return coffeeTotQty;
    }//getCoffeeTotQty()

    public int getTeaTotQty() {
        return teaTotQty;
    }//getTeaTotQty
    public int getDonutTotQty() {
        return donutTotQty;
    }//getDonutTotQty()

    public double getDiscount() {
        return discount;
    }//getDiscount()

    public void setCoffeePrice(double coffeePrice) {
        if (coffeePrice < 0)
            coffeePrice *= -1;
        this.coffeePrice = coffeePrice;
    }//setCoffeePrice()

    public void setTeaPrice(double teaPrice) {
        if (teaPrice < 0)
            teaPrice *= -1;
        this.teaPrice = teaPrice;
    }//setTeaPrice()

    public void setDonutPrice(double donutPrice) {
        if (donutPrice < 0)
            donutPrice *= -1;
        this.donutPrice = donutPrice;
    }//setDonutPrice()

    public double getSubtotal() {
        return subtotal;
    }//getSubtotal()

    public double getDiscountedPrice() {
        return discountedPrice;
    }//getDiscountedPrice()

    public double getTotal() {
        return total;
    }//getTotal()

    public void setCoffeeTotQty(int coffeeTotQty) {
        if (coffeeTotQty < 0)
            coffeeTotQty *= -1;
        this.coffeeTotQty = coffeeTotQty;
    }//setCoffeeTotQty()

    public void setTeaTotQty(int teaTotQty) {
        if (teaTotQty < 0)
            teaTotQty *= -1;
        this.teaTotQty = teaTotQty;
    }//setTeaTotQty()

    public void setDonutTotQty(int donutTotQty) {
        if (donutTotQty < 0)
            donutTotQty *= -1;
        this.donutTotQty = donutTotQty;
    }//setDonutTotQty()

    public void setDiscount(double discount) {
        this.discount = discount / 100;
    }//setDiscount()

    private void calculateSubtotal(int cofq, int teaq, int donq) {
        subtotal = (getCoffeePrice() * cofq) + (getTeaPrice() * teaq) + (getDonutPrice() * donq);
    }//calculateSubtotal()

    private void calculateTotal(int cofq, int teaq, int donq) {
        calculateSubtotal(cofq, teaq, donq);
        total = subtotal - (subtotal * discount);
        discountedPrice = subtotal - total;
    }//calculateTotal()

    public double order(int cofq, int teaq, int donq) {
        if ((getCoffeeTotQty() < cofq) || (getTeaTotQty() < teaq)
                || (getDonutTotQty() < donq)) {
            System.out.print("Error: no enough cups and/or donuts ");
            return 0;
        } else {
            calculateTotal(cofq, teaq, donq);
            display(cofq, teaq, donq);
            return total;
        }//if-else
    }//order()
    private void display(int cofq, int teaq, int donq) {
        System.out.println("-------------------------------------------");
        System.out.println("Item         Quantity         Price");
        System.out.println("-------------------------------------------");
        System.out.println("Coffee          " + cofq + "             " + cofq * getCoffeePrice());
        System.out.println("Tea             " + teaq + "             " + teaq * getTeaPrice());
        System.out.println("Donut           " + donq + "             " + donq * getDonutPrice());
        System.out.println("-------------------------------------------");
        System.out.println("Sub total              " + getSubtotal());
        System.out.println("Discount (%" + getDiscount() * 100 + ")       " + getDiscountedPrice());
        System.out.println("-------------------------------------------");
        System.out.println("Total                  " + getTotal());
        System.out.println("-------------------------------------------");
        System.out.println("");
    }//display()
}//class
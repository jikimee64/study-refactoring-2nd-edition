package refactoringjavastudy.chapter06.ch0603;

public class Order {
    protected int quantity;
    protected int itemPrice;

    public Order(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    // v1
//    public double price() {
//        return this.quantity * this.itemPrice -
//            Math.max(0, this.quantity - 500) * this.itemPrice * 0.05 +
//            Math.min(this.quantity * this.itemPrice * 0.1 , 100);
//    }

    // v2
    public double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double shipping() {
        return Math.min(this.quantity * this.itemPrice * 0.1, 100);
    }

    private double quantityDiscount() {
        return Math.max(0, this.quantity - 500) * this.itemPrice * 0.05;
    }

    private int basePrice() {
        return this.quantity * this.itemPrice;
    }

}

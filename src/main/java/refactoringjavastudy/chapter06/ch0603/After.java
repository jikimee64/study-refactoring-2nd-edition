package refactoringjavastudy.chapter06.ch0603;

public class After {
    public double price(Order order) {
        double basePrice = order.quantity * order.itemPrice;
        double quantityDiscount = Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(order.quantity * order.itemPrice * 0.1 , 100);
        return basePrice - quantityDiscount + shipping;
    }
}

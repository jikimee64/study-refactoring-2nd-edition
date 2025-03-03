package refactoringjavastudy.chapter06.ch0604;

import refactoringjavastudy.chapter06.ch0603.Order;

public class BeforeAfter {

    // before
    public boolean method(Order order) {
        int basePrice = order.basePrice;
        return basePrice > 1000;
    }

    // after
    public boolean method(Order order) {
        return order.basePrice > 1000;
    }
}

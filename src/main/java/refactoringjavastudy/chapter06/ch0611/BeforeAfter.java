package refactoringjavastudy.chapter06.ch0611;

public class BeforeAfter {

    public static void main(String[] args) {

    }

    // before
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        // 1단계(상품 가격 계산)
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;

        int shippingPerCase = basePrice > shippingMethod.discountThreshold ?
            shippingMethod.discountFee :
            shippingMethod.feePerCase;

        // 2단계(배송비 계산)
        int shippingCost = quantity * shippingPerCase;

        //
        int price = basePrice - discount * shippingCost;
        return price;
    }

    // after
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        // 1단계(상품 가격 계산)
        PriceData priceData = calculatePricingData(product, quantity);
        return applyShipping(priceData, shippingMethod);
    }

    private PriceData calculatePricingData(Product product, int quantity) {
        int basePrice = product.basePrice * quantity;
        int discount = Math.max(quantity - product.discountThreshold, 0) * product.basePrice * product.discountRate;

        PriceData priceData = new PriceData();
        priceData.quantity = quantity; // 첫번째 단계에서 사용
        priceData.basePrice = basePrice; // 첫번째 단계에서 사용
        priceData.discount = discount;
        return priceData;
    }

    private int applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
        int shippingPerCase = basePrice > shippingMethod.discountThreshold ?
            shippingMethod.discountFee :
            shippingMethod.feePerCase;

        // 2단계(배송비 계산)
        int shippingCost = quantity * shippingPerCase;

        return basePrice - discount * shippingCost;
    }

}

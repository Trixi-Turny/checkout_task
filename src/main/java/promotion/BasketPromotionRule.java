package promotion;


import checkout.Basket;

public class BasketPromotionRule implements PromotionalRule {

    private final double minTotal;
    private final double percentage;

    public BasketPromotionRule(double minTotal, double percentage) {
        this.minTotal = minTotal;
        this.percentage = percentage;
    }

    public void applyPromotion(Basket basket) {

        double currentTotal = basket.getBasketTotal();
        if(currentTotal >= minTotal) {
            basket.setBasketTotal(currentTotal - (currentTotal * percentage));
        }
    }
}

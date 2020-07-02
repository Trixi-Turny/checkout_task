package checkout;

import promotion.PromotionalRule;

import java.util.List;

public class Checkout {

    public Basket getBasket() {
        return basket;
    }

    private Basket basket = new Basket();
    private final List<PromotionalRule> promotionalRules;

    public Checkout(List<PromotionalRule> promotionalRules) {
        this.promotionalRules = promotionalRules;
    }

    public void scan(Item item) {
        this.basket.add(item);
    }

    public double total() {
        for(PromotionalRule promo : promotionalRules) {
            promo.applyPromotion(basket);
        }
        return (double) Math.round(basket.getBasketTotal()*100)/100;
        //applyPromos
        //return basket total

    }

}

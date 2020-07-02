package checkout;

import promotion.PromotionalRule;

import java.util.List;

public class Checkout {

    private final Basket basket = new Basket();
    private final List<PromotionalRule> promotionalRules;

    public Checkout(List<PromotionalRule> promotionalRules) {
        this.promotionalRules = promotionalRules;
    }

    public void scan(Item item) {
        this.basket.add(item);
    }

    /**
     * Apply Promotions to basket and return calculated total
     * @return the total rounded to 2 decimals
     */
    public double total() {
        if(promotionalRules != null) {
            for (PromotionalRule promo : promotionalRules) {
                promo.applyPromotion(basket);
            }
        }
        return (double) Math.round(basket.getBasketTotal()*100)/100;
    }


    public Basket getBasket() {
        return this.basket;
    }


}

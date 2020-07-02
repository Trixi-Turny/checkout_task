package promotion;

import checkout.Basket;

public class ItemPromotionRule implements PromotionalRule {


    private final String id;
    private final int minQuantity;
    private final double afterPromoPrice;

    public ItemPromotionRule(String id, int minQuantity, double afterPromoPrice) {
        this.id = id;
        this.minQuantity = minQuantity;
        this.afterPromoPrice = afterPromoPrice;
    }
    public void applyPromotion(Basket basket) {

        if(basket.getBasketItems().get(this.id)!= null){
            if(basket.getBasketItems().get(this.id).getQuantity() >= minQuantity) {
                basket.getBasketItems().get(this.id).setCalculatedPrice(afterPromoPrice);
            }
        };
        basket.calculateTotal();
    }
}

package promotion;

import checkout.Basket;

public interface PromotionalRule {

    void applyPromotion(Basket basket);
}

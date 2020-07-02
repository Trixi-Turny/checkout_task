package promotion;

import checkout.Basket;

public interface PromotionalRule {

    /**
     * Applies promotion to a basket or its items
     * @param basket instance of {@link Basket}
     */
    void applyPromotion(Basket basket);
}

import promotion.BasketPromotionRule;
import promotion.ItemPromotionRule;
import promotion.PromotionalRule;

import java.util.List;

public class App {
    public static void main(String[] args) {
        PromotionalRule itemPromo = new ItemPromotionRule("001", 2, 8.75);
        PromotionalRule basketPromo = new BasketPromotionRule(60.00, 0.10);
        List<PromotionalRule> promoList = List.of(itemPromo, basketPromo);
    }
}

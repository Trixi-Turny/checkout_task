import checkout.Checkout;
import checkout.Item;
import org.junit.jupiter.api.Test;
import promotion.BasketPromotionRule;
import promotion.ItemPromotionRule;
import promotion.PromotionalRule;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {


    @Test
    public void scanningItemShouldResultInBasketContainingItem() {
        //given
        Checkout co = new Checkout(null);
        Item item = new Item("001", "some name", 13.50);
        //when
        co.scan(item);

        //then
        assertEquals(co.getBasket().getBasketItems().get("001").getItem(), item);
    }

    @Test
    public void addingItemsOneTwoAndThreeShouldResultInCorrectTotal() {
        //given
        PromotionalRule itemPromo = new ItemPromotionRule("001", 2, 8.50);
        PromotionalRule basketPromo = new BasketPromotionRule(60.00, 0.10);
        List<PromotionalRule> promoList = List.of(itemPromo, basketPromo);

        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item two = new Item("002", "Personalised cufflinks", 45.00);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(promoList);

        //when
        co.scan(one);
        co.scan(two);
        co.scan(three);

        //then
        assertEquals(66.78, co.total());
    }


    @Test
    public void addingItemsOneThreeAndOneShouldResultInCorrectTotal() {
        //given
        PromotionalRule itemPromo = new ItemPromotionRule("001", 2, 8.50);
        PromotionalRule basketPromo = new BasketPromotionRule(60.00, 0.10);
        List<PromotionalRule> promoList = List.of(itemPromo, basketPromo);
        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(promoList);

        //when
        co.scan(one);
        co.scan(three);
        co.scan(one);

        //then
        assertEquals(36.95, co.total());
    }

    @Test
    public void addingItemsOneTwoOneAndThreeShouldResultInCorrectTotal() {

        //given
        PromotionalRule itemPromo = new ItemPromotionRule("001", 2, 8.50);
        PromotionalRule basketPromo = new BasketPromotionRule(60.00, 0.10);
        List<PromotionalRule> promoList = List.of(itemPromo, basketPromo);
        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item two = new Item("002", "Personalised cufflinks", 45.00);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(promoList);

        //when
        co.scan(one);
        co.scan(two);
        co.scan(one);
        co.scan(three);

        //then
        assertEquals(73.76, co.total());
    }

    @Test
    public void addingItemsTwoAndTwoShouldResultInCorrectTotal() {

        //given
        PromotionalRule itemPromo = new ItemPromotionRule("001", 2, 8.50);
        PromotionalRule basketPromo = new BasketPromotionRule(60.00, 0.10);
        List<PromotionalRule> promoList = List.of(itemPromo, basketPromo);

        Item two = new Item("002", "Personalised cufflinks", 45.00);
        Checkout co = new Checkout(promoList);

        //when
        co.scan(two);
        co.scan(two);

        //then
        assertEquals(81.00, co.total());
    }


}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {


    @Test
    public void scanningItemShouldResultInBasketContainingItem() {
        Checkout co = new Checkout(null);
        Item item = new Item("001", "some name", 13.50);
        co.scan(item);
        assertEquals(co.getBasket().getBasketItems().get("001").getItem(), item);
    }

    @Test
    public void addingItemsOneTwoAndThreeShouldResultInCorrectTotal() {

        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item two = new Item("002", "Personalised cufflinks", 45.00);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(null);

        co.scan(one);
        co.scan(two);
        co.scan(three);

        assertEquals(co.total(), 66.78);
    }


    @Test
    public void addingItemsOneThreeAndOneShouldResultInCorrectTotal() {

        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(null);

        co.scan(one);
        co.scan(three);
        co.scan(one);

        assertEquals(co.total(), 36.95);
    }

    @Test
    public void addingItemsOneTwoOneAndThreeShouldResultInCorrectTotal() {

        Item one = new Item("001", "Travel Card Holder", 9.25);
        Item two = new Item("002", "Personalised cufflinks", 45.00);
        Item three = new Item("003", "Kids T-shirt", 19.95);

        Checkout co = new Checkout(null);

        co.scan(one);
        co.scan(two);
        co.scan(one);
        co.scan(three);


        assertEquals(co.total(), 73.76);
    }


}
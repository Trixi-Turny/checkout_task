package checkout;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasketTest {


    @Test
    public void basketItemIncreasesQuantity_WhenSameItemIsAdded_MoreThanOnce() {
        //given
        Basket basket = new Basket();
        basket.add(new Item("001", "something", 10.00));
        basket.add(new Item("001", "something", 10.00));
        basket.add(new Item("002", "something two", 25.00));

        //when
        Map<String, BasketItem> basketItem = basket.getBasketItems();

        //then

        assertEquals(basketItem.get("001").getQuantity(), 2);
    }

    @Test
    public void basketTotalIsCalculatedCorrectly() {
        //given
        Basket basket = new Basket();
        basket.add(new Item("001", "something", 10.00));
        basket.add(new Item("001", "something", 10.00));
        basket.add(new Item("002", "something two", 25.00));

        //when
        double total = basket.calculateTotal();

        //then
        assertEquals(total, 45);

    }

}

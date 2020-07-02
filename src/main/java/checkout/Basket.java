package checkout;

import java.util.HashMap;
import java.util.Map;


/**
 * Represents a basket abstraction of a checkout.
 */
public class Basket {

    private final Map<String, BasketItem> basketItems = new HashMap<>();
    private double basketTotal = 0;

    /**
     * adds items to a basket grouping them by item id, increasing the quantity each time same item is added
     *
     * @param item instance of {@link Item}
     * @return a map of item ids and BasketItems
     */
    public Map<String, BasketItem> add(Item item) {
        if (basketItems.containsKey(item.getId())) {
            int currQuantity = basketItems.get(item.getId()).getQuantity();
            basketItems.get(item.getId()).setQuantity(currQuantity + 1);
        } else {
            basketItems.put(item.getId(), new BasketItem(item, 1));
        }
        return basketItems;
    }

    public Map<String, BasketItem> getBasketItems() {
        return basketItems;
    }

    public double getBasketTotal() {
        return this.basketTotal == 0 ? calculateTotal() : this.basketTotal;
    }

    public void setBasketTotal(double basketTotal) {
        this.basketTotal = basketTotal;
    }


    public double calculateTotal() {
        for (BasketItem item : basketItems.values()) {
            this.basketTotal = this.basketTotal + (item.getQuantity() * item.getCalculatedItemPrice());
        }
        return this.basketTotal;
    }


}

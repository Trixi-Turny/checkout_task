package checkout;

import java.util.HashMap;
import java.util.Map;

public class Basket {


    private double basketTotal = 0;


    private Map<String, BasketItem> basketItems = new HashMap<String, BasketItem>();

    public Map<String, BasketItem> add(Item item) {
        if (basketItems.containsKey(item.getId())) {
            int currQuantity = basketItems.get(item.getId()).getQuantity();
            basketItems.get(item.getId()).setQuantity(currQuantity+1);
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

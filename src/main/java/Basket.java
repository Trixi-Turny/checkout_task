import java.util.HashMap;
import java.util.Map;

public class Basket {


    private Map<String, BasketItem> basketItems = new HashMap<String, BasketItem>();

    public Map<String, BasketItem> add(Item item) {
        if (basketItems.containsKey(item.getId())) {
            int currQuantity = basketItems.get(item.getId()).getQuantity();
            basketItems.get(item.getId()).setQuantity(currQuantity++);
        } else {
            basketItems.put(item.getId(), new BasketItem(item));
        }
        return basketItems;
    }

    public Map<String, BasketItem> getBasketItems() {
        return basketItems;
    }

}

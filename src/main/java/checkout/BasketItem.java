package checkout;


/**
 * Class to cater for an item in a checkout basket.
 */
public class BasketItem {


    private final Item item;
    private int quantity;
    private double calculatedItemPrice;

    public BasketItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.calculatedItemPrice = item.getPrice();
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCalculatedItemPrice() {
        return calculatedItemPrice;
    }

    public void setCalculatedPrice(double calculatedPrice) {
        this.calculatedItemPrice = calculatedPrice;
    }


}

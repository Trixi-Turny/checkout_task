public class BasketItem {


    private Item item;
    private int quantity;
    private double calculatedItemPrice;

    public BasketItem(Item item) {
        this.item = item;
        this.quantity = quantity;
        this.calculatedItemPrice = item.getPrice();
    }


    public Item getItem() {
        return item;
    }


    public int getQuantity() {
        return quantity;
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
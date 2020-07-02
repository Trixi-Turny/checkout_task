package checkout;

/**
 * This class to match the product/item model provided
 */
public class Item {

    private final String id;
    private final String name;
    private final double price;


    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }


}

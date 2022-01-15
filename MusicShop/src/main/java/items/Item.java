package items;

public abstract class Item {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}

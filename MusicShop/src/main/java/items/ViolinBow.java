package items;

public class ViolinBow extends Item {

    private String size;

    public ViolinBow(String description, double buyingPrice, double sellingPrice, String size) {
        super(description, buyingPrice, sellingPrice);
        this.size = size;
    }
}

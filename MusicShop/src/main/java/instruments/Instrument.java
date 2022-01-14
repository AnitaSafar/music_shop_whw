package instruments;

public abstract class Instrument {

    private String material;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}

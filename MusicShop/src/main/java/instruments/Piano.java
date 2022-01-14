package instruments;

public class Piano extends Instrument {

    private int keys;
    private int pedals;

    public Piano(Material material, Type type, double buyingPrice, double sellingPrice, int keys, int pedals) {
        super(material, type, buyingPrice, sellingPrice);
        this.keys = keys;
        this.pedals = pedals;
    }
}

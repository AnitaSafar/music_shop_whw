package instruments;

public class Triangle extends Instrument {

    private int beater;

    public Triangle(Material material, Type type, double buyingPrice, double sellingPrice, int beater) {
        super(material, type, buyingPrice, sellingPrice);
        this.beater = beater;
    }

    public int getBeater() {
        return beater;
    }

    public String play() {
        return "Cling!";
    }
}

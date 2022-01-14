package instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(Material material, Type type, double buyingPrice, double sellingPrice, String sound, int strings) {
        super(material, type, buyingPrice, sellingPrice, sound);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

}

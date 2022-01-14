package instruments;

import behaviours.IPlay;

public abstract class Instrument {

    private Material material;
    private Type type;
    private double buyingPrice;
    private double sellingPrice;
    private String sound;

    public Instrument(Material material, Type type, double buyingPrice, double sellingPrice, String sound) {
        this.material = material;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.sound = sound;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

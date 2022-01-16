import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public int getStockCount() {
        return stock.size();
    }


}

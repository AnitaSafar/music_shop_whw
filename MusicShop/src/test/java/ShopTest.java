import behaviours.ISell;
import instruments.Guitar;
import instruments.Material;
import instruments.Type;
import items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarString guitarString;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(Material.WOOD, Type.STRING, 40, 80.80, 6);
        guitarString = new GuitarString("Rock&Roll", 3, 6.99);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(guitarString);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStockCount());
    }
}

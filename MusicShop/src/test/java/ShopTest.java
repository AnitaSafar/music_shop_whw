import behaviours.ISell;
import instruments.Guitar;
import instruments.Material;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar(Material.WOOD, Type.STRING, 40, 80.80, 6);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }
}

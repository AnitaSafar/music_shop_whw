package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinBowTest {

    ViolinBow violinBow;

    @Before
    public void before() {
        violinBow = new ViolinBow("Gear4music", 7, 14.90, "4/4");
    }

    @Test
    public void hasDescription() {
        assertEquals("Gear4music", violinBow.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(7, violinBow.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(14.90, violinBow.getSellingPrice(), 0.0);
    }
}

package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString("Yamaha", 5, 9.90);
    }

    @Test
    public void hasDescription() {
        assertEquals("Yamaha", guitarString.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5, guitarString.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(9.90, guitarString.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.90, guitarString.calculateMarkup(), 0.0);
    }
}

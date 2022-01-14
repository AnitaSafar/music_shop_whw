package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(Material.WOOD, Type.STRING, 5, 10.50, "Strummm",  6);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10.50, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void hasSound() {
        assertEquals("Strummm", guitar.getSound());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }
}

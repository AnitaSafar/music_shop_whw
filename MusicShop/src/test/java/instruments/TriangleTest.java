package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before() {
        triangle = new Triangle(Material.METAL, Type.PERCUSSION, 6, 12.40, 1);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.METAL, triangle.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(Type.PERCUSSION, triangle.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(6, triangle.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(12.40, triangle.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBeater() {
        assertEquals(1, triangle.getBeater());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Cling!", triangle.play());
    }

}

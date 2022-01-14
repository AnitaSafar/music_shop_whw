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
}

package instruments;

import org.junit.Before;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before() {
        triangle = new Triangle(Material.METAL, Type.PERCUSSION, 6, 12.40, 1);
    }
}

package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(Material.WOOD, Type.STRING, 5, 10.50, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, guitar.getMaterial());
    }

}

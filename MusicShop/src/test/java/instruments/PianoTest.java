package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(Material.WOOD, Type.KEYBOARD, 199, 425, 88, 3);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, piano.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(199, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(425, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasPedals() {
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Plink!", piano.play());
    }

    @Test
    public void canCalculateMarkupPrice() {
        assertEquals(226, piano.calculateMarkup(), 0.0);
    }
}

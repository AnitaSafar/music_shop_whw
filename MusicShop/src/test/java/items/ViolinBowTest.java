package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinBowTest {

    VioliinBow violinBow;

    @Before
    public void before() {
        violinBow = new ViolinBow("Gear4music", "4/4", 7, 14.90);
    }

    @Test
    public void hasDescription() {
        assertEquals("Gear4music", violinBow.getDescription());
    }
}

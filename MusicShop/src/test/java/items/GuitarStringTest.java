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

}

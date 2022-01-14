package instruments;

import org.junit.Before;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(Material.WOOD, Type.KEYBOARD, 199, 425, 88, 3);
    }
    
}

package instruments;

import org.junit.Before;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "String", 5, 10.50, 6);
    }

}

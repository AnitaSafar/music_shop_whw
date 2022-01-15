package items;

import org.junit.Before;

public class ViolinBowTest {

    VioliinBow violinBow;

    @Before
    public void before() {
        violinBow = new ViolinBow("Gear4music", "4/4", 7, 14.90);
    }
}

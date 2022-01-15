package items;

import org.junit.Before;

public class FlashCardsTest {

    FlashCards flashCards;

    @Before
    public void before() {
        flashCards = new FlashCards("Hal Leonard - Set A", 3, 6.99);
    }
}

package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlashCardsTest {

    FlashCards flashCards;

    @Before
    public void before() {
        flashCards = new FlashCards("Hal Leonard - Set A", 3, 6.99);
    }

    @Test
    public void hasDescription() {
        assertEquals("Hal Leonard - Set A", flashCards.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(3, flashCards.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(6.99, flashCards.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.99, flashCards.calculateMarkup(), 0.0);
    }
}

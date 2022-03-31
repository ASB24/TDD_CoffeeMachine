package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCup {

    @Test
    public void thereIsCups()
    {
        Cup smallCups = new Cup(2,10);
        boolean result = smallCups.hasCups(1);
        assertTrue(result);
    }

    @Test
    public void thereIsNoCups()
    {
        Cup smallCups = new Cup(1,10);
        boolean result = smallCups.hasCups(2);
        assertFalse(result);
    }

    @Test
    public void substractCups()
    {
        Cup smallCups = new Cup(5,10);
        smallCups.giveCups(1);
        assertEquals(4,smallCups.getCupQuantity());
    }
}

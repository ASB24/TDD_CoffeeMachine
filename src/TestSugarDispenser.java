package src;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSugarDispenser {
    SugarDispenser sugarDispenser;

    @Before
    public void setUp()
    {
        sugarDispenser = new SugarDispenser(10);
    }

    @Test
    public void thereIsSugarInSugarDispenser(){
        boolean result = sugarDispenser.hasSugar(5);
        assertTrue(result);
        result = sugarDispenser.hasSugar(10);
        assertTrue(result);
    }

    @Test
    public void thereIsNoSugarInSugarDispenser(){
        boolean result = sugarDispenser.hasSugar(15);
        assertFalse(result);
    }

    @Test
    public void substractSugarToSugarDispenser()
    {
        sugarDispenser.giveSugar(5);
        assertEquals(5,sugarDispenser.getSugarQuantity());
        sugarDispenser.giveSugar(2);
        assertEquals(3,sugarDispenser.getSugarQuantity());
    }
}
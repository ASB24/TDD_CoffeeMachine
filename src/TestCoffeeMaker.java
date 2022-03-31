package src;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCoffeeMaker {

    @Test
    public void thereIsCoffeeInCoffeeMaker()
    {
        CoffeeMaker coffeeMaker = new CoffeeMaker(10);
        boolean result = coffeeMaker.hasCoffee(5);
        assertTrue(result);
    }

    @Test
    public void thereIsNoCoffeeInCoffeeMaker()
    {
        CoffeeMaker coffeeMaker = new CoffeeMaker(10);
        boolean result = coffeeMaker.hasCoffee(11);
        assertFalse(result);
    }

    @Test
    public void substractCoffeeToCoffeeMaker()
    {
        CoffeeMaker coffeeMaker = new CoffeeMaker(10);
        coffeeMaker.giveCoffee(7);
        assertEquals(3,coffeeMaker.getCoffeeQuantity());
    }
}

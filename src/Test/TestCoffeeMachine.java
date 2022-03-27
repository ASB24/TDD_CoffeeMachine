package Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCoffeeMachine {

    CoffeeMaker coffeeMaker;
    Cup smallCups;
    Cup mediumCups;
    Cup bigCups;
    SugarDispenser sugarDispenser;
    CoffeeMachine coffeeMachine;

    @Before
    public void setUp()
    {
        coffeeMaker = new CoffeeMaker(50);
        smallCups = new Cup(5,10);
        mediumCups = new Cup(5,20);
        bigCups = new Cup(5,30);
        sugarDispenser = new SugarDispenser(20);

        coffeeMachine = new CoffeeMachine();
        coffeeMachine.setCoffeeMaker(coffeeMaker);
        coffeeMachine.setSmallCups(smallCups);
        coffeeMachine.setMediumCups(mediumCups);
        coffeeMachine.setBigCups(bigCups);
        coffeeMachine.setSugarDispenser(sugarDispenser);
    }

    @Test
    public void getSmallCup()
    {
        Cup cup = coffeeMachine.getCupBySize("small");
        assertEquals(coffeeMachine.smallCups,cup);
    }

    @Test
    public void getMediumCup()
    {
        Cup cup = coffeeMachine.getCupBySize("medium");
        assertEquals(coffeeMachine.mediumCups,cup);
    }

    @Test
    public void getBigCup()
    {
        Cup cup = coffeeMachine.getCupBySize("big");
        assertEquals(coffeeMachine.bigCups,cup);
    }

    @Test
    public void thereIsNoCups()
    {
        Cup cup = coffeeMachine.getCupBySize("small");
        String result = coffeeMachine.getCupWithCoffee(cup,10,2);
        assertEquals("There is no Cups", result);
    }

    @Test
    public void thereIsNoCoffee(){
        coffeeMaker = new CoffeeMaker(5);
        coffeeMachine.setCoffeeMaker(coffeeMaker);

        Cup cup = coffeeMachine.getCupBySize("small");
        String result = coffeeMachine.getCupWithCoffee(cup,1,2);
        assertEquals("There is no Coffee", result);
    }

    @Test
    public void thereIsNoSugar()
    {
        sugarDispenser = new SugarDispenser(2);
        coffeeMachine.setSugarDispenser(sugarDispenser);
        Cup cup = coffeeMachine.getCupBySize("small");
        String result = coffeeMachine.getCupWithCoffee(cup,1,3);
        assertEquals("There is no Sugar", result);
    }

    @Test
    public void substractCoffee()
    {
        Cup cup = coffeeMachine.getCupBySize("small");
        coffeeMachine.getCupWithCoffee(cup,1,3);
        int result = coffeeMachine.getCoffeeMaker().getCoffeeQuantity();
        assertEquals(40,result);
    }

    @Test
    public void substractCups()
    {
        Cup cup = coffeeMachine.getCupBySize("small");
        coffeeMachine.getCupWithCoffee(cup,1,3);
        int result = coffeeMachine.getSmallCups().getCupQuantity();
        assertEquals(4,result);
    }

    @Test
    public void substractSugar(){
        Cup cup = coffeeMachine.getCupBySize("small");
        coffeeMachine.getCupWithCoffee(cup, 1, 3);
        int result =coffeeMachine.getSugarDispenser().getSugarQuantity();
        assertEquals(17, result);
    }

    @Test
    public void shouldReturnCongratulations()
    {
        Cup cup = coffeeMachine.getCupBySize("small");
        String result = coffeeMachine.getCupWithCoffee(cup,1,3);
        assertEquals("Congratulations",result);
    }
}

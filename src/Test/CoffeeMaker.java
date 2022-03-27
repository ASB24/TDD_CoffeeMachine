package Test;

public class CoffeeMaker {
    private int coffeeQuantity;

    //Getters & Setters
    public void setCoffeeQuantity(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }
    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    //Other functions
    public boolean hasCoffee(int coffeeQuantity){
        return this.coffeeQuantity >= coffeeQuantity;
    }
    public void giveCoffee(int coffeeQuantity){
        this.coffeeQuantity -= coffeeQuantity;
    }

    public CoffeeMaker(int coffeeQuantity){
        this.setCoffeeQuantity(coffeeQuantity);
    }
}

package src;
public class SugarDispenser {
  
    private int sugarQuantity;

    //Getters & Setters
    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }
    public int getSugarQuantity() {
        return sugarQuantity;
    }

    //Other functions
    public boolean hasSugar(int sugarQuantity){
        return this.sugarQuantity >= sugarQuantity;
    }
    public void giveSugar(int sugarQuantity){
        this.sugarQuantity -= sugarQuantity;
    }

    public SugarDispenser(int sugarQuantity){
        this.setSugarQuantity(sugarQuantity);
    }
}

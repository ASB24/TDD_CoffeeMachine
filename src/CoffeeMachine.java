package src;
import java.util.Objects;

public class CoffeeMachine {
    
    protected CoffeeMaker coffeeMaker;
    protected Cup smallCups;
    protected Cup mediumCups;
    protected Cup bigCups;
    protected SugarDispenser sugarDispenser;

    //Getters & Setters
    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }
    public void setSmallCups(Cup smallCups) {
        this.smallCups = smallCups;
    }
    public void setMediumCups(Cup mediumCups) {
        this.mediumCups = mediumCups;
    }
    public void setBigCups(Cup bigCups) {
        this.bigCups = bigCups;
    }
    public void setSugarDispenser(SugarDispenser sugarDispenser) {
        this.sugarDispenser = sugarDispenser;
    }
    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public Cup getSmallCups() {
        return smallCups;
    }

    public SugarDispenser getSugarDispenser() {
        return sugarDispenser;
    }

    public Cup getCupBySize(String cupType)
    {
        if(Objects.equals(cupType, "small"))
        {
            return smallCups;
        }
        else if(Objects.equals(cupType, "medium"))
        {
            return mediumCups;
        }
        else if(Objects.equals(cupType, "big"))
        {
            return bigCups;
        }
        else
            return null;
    }

    public String getCupWithCoffee(Cup cup, int cupQty, int sugarQty){
        //Cup
        if(cup.equals(this.smallCups) && this.smallCups.hasCups(cupQty)){
            this.smallCups.giveCups(cupQty);
        }else if(cup.equals(this.mediumCups) && this.mediumCups.hasCups(cupQty)){
            this.mediumCups.giveCups(cupQty);
        }else if(cup.equals(this.bigCups) && this.bigCups.hasCups(cupQty)){
            this.bigCups.giveCups(cupQty);
        }else
            return "There is no Cups";

        //Sugar
        if(this.sugarDispenser.hasSugar(sugarQty)){
            this.sugarDispenser.giveSugar(sugarQty);
        }else{
            return "There is no Sugar";
        }

        //Coffee
        if(this.coffeeMaker.hasCoffee(cup.getContent())){
            this.coffeeMaker.giveCoffee(cup.getContent());
        }else{
            return "There is no Coffee";
        }

        return "Congratulations";
    }

}

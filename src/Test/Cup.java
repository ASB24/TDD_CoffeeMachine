package Test;

public class Cup {
    
    private int cupQuantity;
    private int content;
    
    //Getters & Setters

    public int getCupQuantity() {
        return cupQuantity;
    }
    public int getContent() {
        return content;
    }
    public void setCupQuantity(int cupQuantity) {
        this.cupQuantity = cupQuantity;
    }
    public void setContent(int content) {
        this.content = content;
    }

    // Other functions
    public boolean hasCups(int cupQuantity){
        return this.cupQuantity >= cupQuantity;
    }

    public void giveCups(int cupQuantity){
        this.cupQuantity -= cupQuantity;
    }

    public Cup(int cupQuantity, int content) {
        this.setContent(content);
        this.setCupQuantity(cupQuantity);
    }
}

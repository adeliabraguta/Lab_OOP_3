package Classes.Pizza;

import Classes.MeatPizza;

public class BBQ extends MeatPizza {

    private int gramsOfBacon;
    private int gramsOfBbqSouse;

    public BBQ() {
        super("extra thick", 50, 70, 160, true);
        this.gramsOfBacon = 80;
        this.gramsOfBbqSouse = 30;
    }

    public void makeBBQ() {
        addMeat();
        System.out.println("In the end the cook added " + gramsOfBacon + " grams of bacon and " + gramsOfBbqSouse + " grams of bbq souse");
    }
}

package Classes.Pizza;

import Classes.MeatPizza;

public class Pepperoni extends MeatPizza {

    private int gramsOfMozzarella;
    private int paprikaAndChilly;

    public Pepperoni() {
        super("thin", 30, 50, 100, true);
        this.gramsOfMozzarella = 100;
        this.paprikaAndChilly = 15;
    }

    public void makePepperoni () {
        addMeat();
        System.out.println("In the end the cook added " + paprikaAndChilly + " grams of paprika and chilly to make it spicy and "
                + gramsOfMozzarella + " grams of mozzarella");
    }
}

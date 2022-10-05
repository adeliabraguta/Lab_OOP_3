package Classes.Pizza;

import Classes.MeatPizza;

public class Rancho extends MeatPizza {
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;

    public Rancho() {
        super("thick", 40, 60, 120, false);
        this.gramsOfMushrooms = 80;
        this.gramsOfMozzarella = 100;
    }

    public void makeRancho() {
        addMeat();
        System.out.println("In the end the cook added " + gramsOfMushrooms + " grams of mushrooms and " + gramsOfMozzarella + " grams of mozzarella");
    }
}

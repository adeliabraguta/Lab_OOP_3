package Classes.Pizza;

import Classes.MeatPizza;

public class Neapolitana extends MeatPizza {
    private int gramsOfMushrooms;
    private int gramsOfMozzarella;

    public Neapolitana() {
        super("thin", 25, 50, 100, true);
        this.gramsOfMushrooms = 50;
        this.gramsOfMozzarella = 75;
    }

    public void makeNeapolitana() {
        addMeat();
        System.out.println("In the end the cook added " + gramsOfMushrooms + " grams of mushrooms and " + gramsOfMozzarella + " grams of mozzarella");
    }
}

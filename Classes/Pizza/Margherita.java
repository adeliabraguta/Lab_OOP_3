package Classes.Pizza;

import Classes.VegetarianPizza;

public class Margherita extends VegetarianPizza {
    private int gramsOfTomatoSouse;
    private int gramsOfMozzarella;

    public Margherita() {
        super("extra thin", 25, 75, 50, false);
        this.gramsOfTomatoSouse = 100;
        this.gramsOfMozzarella = 125;
    }

    public void makeMargherita() {
        addVegies();
        System.out.println("In the end the cook added " + gramsOfTomatoSouse + " grams of tomato souse and "
                + gramsOfMozzarella + " grams of mozzarella");
    }
}

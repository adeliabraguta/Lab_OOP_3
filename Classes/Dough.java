package Classes;

public class Dough {

    private String thickness;
    private int size;
    private int amountOfSouse;

    public Dough(String thickness, int size, int amountOfSouse) {
        this.thickness = thickness;
        this.size = size;
        this.amountOfSouse = amountOfSouse;
    }

    public void makeDough(){
        System.out.println("First, the cook makes a " + thickness + " pizza dough that is " + size
                + " cm wide, and then he spreads " + amountOfSouse + " grams of souse on top of that.");
    }
}

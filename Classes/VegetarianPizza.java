package Classes;

public class VegetarianPizza extends Dough {

    private int tomatoes;
    private boolean broccoli;

//    public VegetarianPizza(String thickness, int size, int amountOfSouse) {
//        super(thickness, size, amountOfSouse);
//    }

    public VegetarianPizza(String thickness, int size, int amountOfSouse, int tomatoes, boolean broccoli) {
        super(thickness, size, amountOfSouse);
        this.tomatoes = tomatoes;
        this.broccoli = broccoli;
    }

    @Override
    public void makeDough() {
        super.makeDough();
    }

    public void addVegies() {
        makeDough();
        if (broccoli) {
            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes and broccoli on pizza");
        } else {
            System.out.println("After, the cook added " + tomatoes + " grams of tomatoes on pizza");
        }
    }
}

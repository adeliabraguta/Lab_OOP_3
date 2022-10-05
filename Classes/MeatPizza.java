package Classes;

public class MeatPizza extends Dough {
    private int chicken;
    private boolean sausage;

//    public MeatPizza(String thickness, int size, int amountOfSouse) {
//        super(thickness, size, amountOfSouse);
//    }


    public MeatPizza(String thickness, int size, int amountOfSouse, int chicken, boolean sausage) {
        super(thickness, size, amountOfSouse);
        this.chicken = chicken;
        this.sausage = sausage;
    }

    @Override
    public void makeDough() {
        super.makeDough();
    }

    public void addMeat() {
        makeDough();
        if(sausage){
            System.out.println("After, the cook added " + chicken + " grams of chicken and sausages on pizza");
        } else {
            System.out.println("After, the cook added " + chicken + " grams of chicken on pizza");
        }
    }
}

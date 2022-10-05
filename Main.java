import java.util.Random;
import Classes.Pizza.*;

public class Main {
    public static void main(String[] args) {

        BBQ bbq = new BBQ();
        Capricioasa capricioasa = new Capricioasa();
        Pepperoni pepperoni = new Pepperoni();
        Diablo diablo = new Diablo();
        Margherita margherita = new Margherita();
        Neapolitana neapolitana = new Neapolitana();
        QuattroFormaggi quattroFormaggi = new QuattroFormaggi();
        Rancho rancho = new Rancho();

        Random rand = new Random();
        int randomNumber = rand.nextInt(8) + 1;

        switch (randomNumber) {
            case 1:
                System.out.println("The customer ordered a BBQ pizza");
                bbq.makeBBQ();
                break;
            case 2:
                System.out.println("The customer ordered a Capricioasa pizza");
                capricioasa.makeCapricioasa();
                break;
            case 3:
                System.out.println("The customer ordered a Diablo pizza");
                diablo.makeDiablo();
                break;
            case 4:
                System.out.println("The customer ordered a Margherita pizza");
                margherita.makeMargherita();
                break;
            case 5:
                System.out.println("The customer ordered a Neapolitana pizza");
                neapolitana.makeNeapolitana();
                break;
            case 6:
                System.out.println("The customer ordered a Pepperoni pizza");
                pepperoni.makePepperoni();
                break;
            case 7:
                System.out.println("The customer ordered a Quattro Formaggi pizza");
                quattroFormaggi.makeQuattroFormaggi();
                break;
            case 8:
                System.out.println("The customer ordered a Rancho pizza");
                rancho.makeRancho();
                break;
        }
        System.out.println("Then he put the pizza in the oven for 15 minutes and delivered it to the customer");
    }
}
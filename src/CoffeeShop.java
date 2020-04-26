import concrete_components.DarkRoast;
import components.Beverage;
import concrete_decorator.Milk;
import concrete_decorator.Soy;
import concrete_decorator.Whip;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);
        beverage = new Whip(beverage);

        System.out.println("============================================");
        System.out.println("ORDER: " + beverage.getDescription());
        System.out.println(String.format("TOTAL: %.2f", beverage.cost()));
        System.out.println("============================================");

    }
}

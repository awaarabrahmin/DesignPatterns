package AbstractFactoryPattern.Problem;

public class CoffeFactory {

    public Coffee makeCoffee(String coffeType) {
        if (coffeType == "Cappucino")
            return new Cappucino(new AmericanBean(), new BrownSugar(), new CowMilk());
        else
            return new Robusta(new AmericanBean(),new BrownSugar(), new CowMilk());
    }
}

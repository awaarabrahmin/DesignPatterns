package AbstractFactoryPattern.Complex;

public class CoffeServer {

    public Coffee makeCoffee(String coffeeType){
        if (coffeeType=="Cappucino")
            return new Cappucino(new CappucinoIngredientFactory());
        else
            return new Robusta(new RobustaIngredientFactory());
    }
}

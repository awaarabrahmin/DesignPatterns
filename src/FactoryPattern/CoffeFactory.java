package FactoryPattern;

public class CoffeFactory {

    public Coffee makeCoffee(String coffeType)
    {
        if(coffeType=="Cappucino")
            return new Cappucino();
        else
            return new Robusta();
    }
}

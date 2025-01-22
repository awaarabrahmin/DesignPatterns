package AbstractFactoryPatternSimple;



public class CoffeFactoryImplementor implements CoffeFactory {


    @Override
    public Coffee makeCoffee(String coffeType) {
        if(coffeType=="Cappucino")
            return new Cappucino();
        else
            return new Robusta();
    }
}

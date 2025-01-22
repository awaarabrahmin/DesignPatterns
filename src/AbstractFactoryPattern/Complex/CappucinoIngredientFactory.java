package AbstractFactoryPattern.Complex;

public class CappucinoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }
}

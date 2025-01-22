package AbstractFactoryPattern.Complex;

public class RobustaIngredientFactory implements IngredientFactory{
    @Override
    public Bean getBean() {
        return new IndianBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }
}

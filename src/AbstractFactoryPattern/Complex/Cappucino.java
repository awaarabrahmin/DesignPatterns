package AbstractFactoryPattern.Complex;

public class Cappucino extends Coffee{


    protected Cappucino(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void boil() {
        System.out.println("cappucino Boiled");
    }

    @Override
    public void serve() {
        System.out.println("Cappucino Served");
    }
}

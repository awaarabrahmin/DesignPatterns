package AbstractFactoryPattern.Complex;

public class Robusta extends Coffee{

    protected Robusta(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void boil() {
        System.out.println("Robusta Boiled");
    }

    @Override
    public void serve() {
        System.out.println("Robusta Served");
    }
}

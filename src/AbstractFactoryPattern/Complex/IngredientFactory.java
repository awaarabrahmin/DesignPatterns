package AbstractFactoryPattern.Complex;

public interface IngredientFactory {

    Bean getBean();

    Milk getMilk();

    Sugar getSugar();


}

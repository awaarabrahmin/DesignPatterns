package AbstractFactoryPattern.Problem;

public class Robusta extends Coffee{


    protected Robusta(Bean bean, Sugar sugar, Milk milk) {
        super(bean, sugar, milk);
    }

    @Override
    public void boil() {

    }

    @Override
    public void serve() {

    }
}

package AbstractFactoryPattern.Problem;

public class Cappucino extends Coffee{

    public Cappucino(Bean bean, Sugar sugar, Milk milk){
        super(bean,sugar,milk);
    }

    @Override
    public void boil() {

    }

    @Override
    public void serve() {

    }
}

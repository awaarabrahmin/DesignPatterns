package AbstractFactoryPattern.Problem;

public abstract class Coffee {

    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;


    protected Coffee(Bean bean, Sugar sugar, Milk milk) {
        this.bean = bean;
        this.sugar = sugar;
        this.milk = milk;
    }

    public abstract void boil();

    public abstract void serve();
}

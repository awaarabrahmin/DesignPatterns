package AbstractFactoryPatternSimple;



public class Robusta implements Coffee {
    @Override
    public void boil() {
        System.out.println("Robusta Boiled");
    }

    @Override
    public void serve() {
        System.out.println("Robusta Served");
    }
}

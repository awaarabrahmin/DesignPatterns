package FactoryPattern;

public class Cappucino implements Coffee{
    @Override
    public void boil() {
        System.out.println("Cappucion Boiled");
    }

    @Override
    public void serve() {
        System.out.println("Cappucino Served");
    }
}

package AbstractFactoryPatternSimple;



public class Main {

    public static void main(String[] args) {//With chaining
        Coffee coffee=new CoffeeServer().makeCoffee("Robusta");
        coffee.serve();
    }
}

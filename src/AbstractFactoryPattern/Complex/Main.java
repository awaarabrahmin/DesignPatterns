package AbstractFactoryPattern.Complex;



public class Main {

    public static void main(String[] args) {//With chaining
        Coffee coffee=new CoffeServer().makeCoffee("Cappucino");
        coffee.serve();
    }
}

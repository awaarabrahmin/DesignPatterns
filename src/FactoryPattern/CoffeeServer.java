package FactoryPattern;

public class CoffeeServer {

       public Coffee makeCoffee(String coffeType){
           return new CoffeFactory().makeCoffee(coffeType);
       }
}

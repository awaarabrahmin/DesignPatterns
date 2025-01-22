package AbstractFactoryPatternSimple;



public class CoffeeServer {

       public Coffee makeCoffee(String coffeType){

           CoffeFactory coffeFactory= new CoffeFactoryImplementor();
           return coffeFactory.makeCoffee(coffeType);
       }
}

package StrategyPattern.Tester;

import StrategyPattern.Inserter.OrederedInserter;
import StrategyPattern.NumberStore;
import StrategyPattern.Searcher.BinarySearcher;
import StrategyPattern.Searcher.LinearSearcher;

public class Tester {

    public static void main(String [] args){
        NumberStore numberStore= new NumberStore(new OrederedInserter(),new BinarySearcher());
        numberStore.addNum(5);
        numberStore.addNum(2);
        numberStore.addNum(8);
        numberStore.addNum(1);
        System.out.println(numberStore.search(1));
        System.out.println(numberStore.search(5));
    }
}

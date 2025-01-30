package StrategyPattern;

import StrategyPattern.Inserter.Inserter;
import StrategyPattern.Searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {

    private List<Integer> nums;
    private Inserter inserter;
    private Searcher searcher;

    public NumberStore(Inserter inserter, Searcher searcher) {
        this.inserter = inserter;
        this.searcher = searcher;
        this.nums=new ArrayList<>();
    }


    public void addNum(Integer num){
        this.inserter.addNum(num,this.nums);
    }

    public Integer search(Integer key){
        return this.searcher.search(key,this.nums);
    }

}

package StrategyPattern.Inserter;

import java.util.List;

public class UnOrderedInserter implements Inserter{
    @Override
    public void addNum(Integer num, List<Integer> nums) {
        nums.add(num);
    }
}

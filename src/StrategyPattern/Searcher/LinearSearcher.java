package StrategyPattern.Searcher;

import java.util.List;

public class LinearSearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> nums) {
        for(int i=0;i<nums.size();i++){
            if(key==nums.get(i))
                return i;
        }
        return -1;
    }
}

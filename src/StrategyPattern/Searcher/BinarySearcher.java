package StrategyPattern.Searcher;

import java.util.Collections;
import java.util.List;

public class BinarySearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> nums) {
        int position=Collections.binarySearch(nums,key);
        return position;
    }
}

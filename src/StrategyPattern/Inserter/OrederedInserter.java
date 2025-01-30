package StrategyPattern.Inserter;

import java.util.List;

public class OrederedInserter implements Inserter{


    @Override
    public void addNum(Integer num, List<Integer> nums) {
        int pos=0;
        if(nums.size()!=0) {
            if (nums.get(0) > num)
                pos = 0;
            else if (nums.get(nums.size() - 1) < num)
                pos = nums.size();
            else {
                for (int i = 1; i < nums.size(); i++) {
                    if (nums.get(i) > num && nums.get(i - 1) < num) {
                        pos = i;
                        break;
                    }
                }
            }
        }
        nums.add(pos,num);
        for(int element : nums)
            System.out.print(element+" ");
        System.out.println();
    }
}

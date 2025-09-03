package main.com.example.AdventOfCode;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class DistancesCalculator {
    public List<Integer> DistanceCalculator(AbstractMap.SimpleEntry<List<Integer>,List<Integer>> input)
    {
        List<Integer> leftList = input.getKey();
        List<Integer> rightList = input.getValue();
        List<Integer> result = new ArrayList<>();

        for(int c=0; c < leftList.size(); c++){
            result.add(Math.abs(leftList.get(c) - rightList.get(c)));
        }

        return result ;
    }
}

package main.com.example.AdventOfCode;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsSorter {
    public AbstractMap.SimpleEntry<List<Integer>, List<Integer>> sort(AbstractMap.SimpleEntry<List<Integer>,List<Integer>> input)
    {
        List<Integer> keys = new ArrayList<>(input.getKey());
        List<Integer> values = new ArrayList<>(input.getValue());

        Collections.sort(keys);
        Collections.sort(values);

        return new AbstractMap.SimpleEntry<>(keys, values);
    }
}

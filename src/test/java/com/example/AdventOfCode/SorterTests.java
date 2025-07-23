package test.java.com.example.AdventOfCode;

import main.com.example.AdventOfCode.ListsSorter;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SorterTests {
    @Test
    void SortReturnsEmptyListsGivenEmptyLists(){
        //Arrange
        AbstractMap.SimpleEntry<List<Integer>,List<Integer>> input = new AbstractMap.SimpleEntry<List<Integer>,List<Integer>>(
                new ArrayList<>(),new ArrayList<>()
        );
        ListsSorter sut = new ListsSorter();

        //Act
        AbstractMap.SimpleEntry<List<Integer>, List<Integer>> result = sut.sort(input);

        //Assert
        assertTrue(result.getKey().isEmpty());
        assertTrue(result.getValue().isEmpty());

    }
}

package test.java.com.example.AdventOfCode;

import main.com.example.AdventOfCode.ListsSorter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ListsSorterTests {
    private static Stream<Arguments> InputListsSorter() {
        return Stream.of(
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(), List.of()),new AbstractMap.SimpleEntry<>(List.of(), List.of())),
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(1),List.of(2)),new AbstractMap.SimpleEntry<>(List.of(1), List.of(2))),
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(1,2),List.of(3,4)),new AbstractMap.SimpleEntry<>(List.of(1,2), List.of(3,4))),
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(56208,52621),List.of(95668,74203)),new AbstractMap.SimpleEntry<>(List.of(52621,56208), List.of(74203,95668)))
        );
    }

    @ParameterizedTest
    @MethodSource("InputListsSorter")
    void SorterReturnsValidValuesGivenValidInput (AbstractMap.SimpleEntry<List<Integer>,List<Integer>> input,
                                                  AbstractMap.SimpleEntry<List<Integer>,List<Integer>> expected)
    {
        // Arrange
        ListsSorter sut = new ListsSorter();

        // Act
        AbstractMap.SimpleEntry<List<Integer>, List<Integer>> result = sut.sort(input);

        // Assert
        assertEquals(expected, result);
    }

}

package test.java.com.example.AdventOfCode;

import main.com.example.AdventOfCode.DistancesCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistancesCalculatorTests {

    private static Stream<Arguments> DistanceCalculatorValues() {
        return Stream.of(
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(), List.of()), List.of()),
                Arguments.of(
                        //input                                                 //expected
                        new AbstractMap.SimpleEntry<>(List.of(2,1,5),List.of(4,3,2)),List.of(2,2,3))
        );
    }
    @ParameterizedTest
    @MethodSource("DistanceCalculatorValues")
    void DistancesCalculatorParameterisedValues(AbstractMap.SimpleEntry<List<Integer>,List<Integer>> input, List<Integer> expected){
        //Arrange
        DistancesCalculator sut = new DistancesCalculator();

        //Act
        List<Integer> result = sut.DistanceCalculator(input);

        //Assert
        assertEquals(expected,result);

    }
}

package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoNumbersSumTest {

    private TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

    @Test
    public void addSingleDigitNumbers() {
        List<Integer> result = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Collections.singletonList(2)),
                new ArrayList<>(Collections.singletonList(3))
        );
        Assertions.assertEquals(new ArrayList<>(Collections.singletonList(5)), result);
    }

    @Test
    public void addMultipleDifferentDigitNumbers() {
        List<Integer> result = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 5, 2)),
                new ArrayList<>(Arrays.asList(2, 7))
        );
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1, 7, 9)), result);
    }

    @Test
    public void addMultipleSameDigitNumbers() {
        List<Integer> result = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 5, 2)),
                new ArrayList<>(Arrays.asList(3, 8, 1))
        );
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(5, 3, 3)), result);
    }

    @Test
    public void addOneEmpty() {
        List<Integer> result = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(6, 7))
        );
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(6, 7)), result);
    }

    @Test
    public void addWithComplement() {
        List<Integer> result = twoNumbersSum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9, 9)),
                new ArrayList<>(Arrays.asList(2, 2, 2))
        );
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1, 2, 2, 1)), result);
    }
}

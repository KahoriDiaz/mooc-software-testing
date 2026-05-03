package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void singleDigits() {
        // 3 + 5 = 8
        ArrayList<Integer> left  = new ArrayList<>(Arrays.asList(3));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(left, right);
        Assertions.assertEquals(Arrays.asList(8), result);
    }

    @Test
    public void withCarry() {
        // 19 + 1 = 20
        ArrayList<Integer> left  = new ArrayList<>(Arrays.asList(1, 9));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(left, right);
        Assertions.assertEquals(Arrays.asList(2, 0), result);
    }

    @Test
    public void multiDigitNoCarry() {
        // 12 + 23 = 35
        ArrayList<Integer> left  = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(left, right);
        Assertions.assertEquals(Arrays.asList(3, 5), result);
    }

    @Test
    public void multiDigitWithCarry() {
        // 99 + 1 = 100
        ArrayList<Integer> left  = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(left, right);
        Assertions.assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void differentLengths() {
        // 123 + 7 = 130
        ArrayList<Integer> left  = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(left, right);
        Assertions.assertEquals(Arrays.asList(1, 3, 0), result);
    }
}

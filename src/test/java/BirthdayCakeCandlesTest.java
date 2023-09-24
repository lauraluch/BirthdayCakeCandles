import com.sun.jdi.InvalidTypeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void shouldTallestCandleBeTheHighestNumberOfList() {
        int age = 5;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(1, 3, 5, 9, 7));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles();
        final int obtained = sut.getTallestCandle(age, candleHeights);
        assertEquals(9, obtained);
    }

    @Test
    void shouldThrowExceptionIfListSizeIsLessThanAge() {
        int age = 5;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(1, 3, 5));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            sut.getTallestCandle(age, candleHeights);
        });
    }

    @Test
    void shouldAmountOfBlownOutCandlesBeMoreThanOne() {
        int age = 7;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(12, 3, 5, 8, 2, 3, 12));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles();
        assertTrue(sut.getAmountOfBlownOutCandles(age, candleHeights) > 1);
    }

    @Test
    void shouldThrowExceptionIfAgeIsANegativeNumber() {
        int age = -2;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(12, 3));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles();
        assertThrows(IllegalArgumentException.class, () -> {
            sut.getTallestCandle(age, candleHeights);
        });
    }
}
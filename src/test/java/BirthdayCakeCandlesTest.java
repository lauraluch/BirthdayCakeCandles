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
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);
        final int obtained = sut.getTallestCandle();
        assertEquals(9, obtained);
    }

    @Test
    void shouldThrowExceptionIfListSizeIsLessThanAge() {
        int age = 5;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(1, 3, 5));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            sut.getTallestCandle();
        });
    }

    @Test
    void shouldAmountOfBlownOutCandlesBeMoreThanOne() {
        int age = 7;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(12, 3, 5, 8, 2, 3, 12));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);
        assertTrue(sut.getAmountOfBlownOutCandles() > 1);
    }

    @Test
    void shouldAmountOfBlownOutCandlesBeThree() {
        int age = 8;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(
                12, 8, 3, 10, 12, 7, 3, 12
        ));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);
        assertEquals(3, sut.getAmountOfBlownOutCandles());
    }

    @Test
    void shouldThrowExceptionIfAgeIsANegativeNumber() {
        int age = -2;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(1, 2));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);
        assertThrows(IllegalArgumentException.class, () -> {
            sut.validateAge();
        });
    }

    @Test
    void shouldThrowExceptionIfCandleHeightIsANegativeNumber() {
        int age = 3;
        List<Integer> candleHeights = new ArrayList<>(Arrays.asList(1, 2, -2));
        final BirthdayCakeCandles sut = new BirthdayCakeCandles(age, candleHeights);
        assertThrows(IllegalArgumentException.class, () -> {
            sut.validateCandleHeightsValues();
        });
    }
}
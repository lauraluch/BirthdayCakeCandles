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
    void getAmountOfBlownOutCandles() {
    }
}
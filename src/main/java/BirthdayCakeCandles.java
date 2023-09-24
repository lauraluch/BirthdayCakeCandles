import java.util.List;

public class BirthdayCakeCandles {

    public void validateAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("The age must be more than zero.");
        }
    }

    public int getTallestCandle(int age, List<Integer> candleHeights) {
        validateAge(age);
        int tallestCandle = candleHeights.get(0);
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) > tallestCandle) {
                tallestCandle = candleHeights.get(counter);
            }
        }

        return tallestCandle;
    }

    public int getAmountOfBlownOutCandles(int age, List<Integer> candleHeights){
        validateAge(age);
        int tallestCandle = getTallestCandle(age, candleHeights);
        int amountOfCandlesBlownOut = 0;
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) == tallestCandle) {
                amountOfCandlesBlownOut++;
            }
        }

        return amountOfCandlesBlownOut;
    }
}

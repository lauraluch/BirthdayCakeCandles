import java.util.List;

public class BirthdayCakeCandles {
    public static int getTallestCandle(int age, List<Integer> candleHeights) {
        int tallestCandle = candleHeights.get(0);
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) > tallestCandle) {
                tallestCandle = candleHeights.get(counter);
            }
        }

        return tallestCandle;
    }
    
    public static int getAmountOfBlownOutCandles(int tallestCandle, int age, List<Integer> candleHeights){
        int amountOfCandlesBlownOut = 0;
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) == tallestCandle) {
                amountOfCandlesBlownOut++;
            }
        }

        return amountOfCandlesBlownOut;
    }
}

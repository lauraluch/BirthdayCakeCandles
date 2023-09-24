import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    int age;
    List<Integer> candleHeights = new ArrayList<>();

    public BirthdayCakeCandles(int age, List<Integer> candleHeights) {
        this.age = age;
        this.candleHeights = candleHeights;
    }

    public void validateAge() {
        if (age <= 0){
            throw new IllegalArgumentException("The age must be more than zero.");
        }
    }

    public int getTallestCandle() {
        int tallestCandle = candleHeights.get(0);
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) > tallestCandle) {
                tallestCandle = candleHeights.get(counter);
            }
        }

        return tallestCandle;
    }

    public int getAmountOfBlownOutCandles(){
        int tallestCandle = getTallestCandle();
        int amountOfCandlesBlownOut = 0;
        for (int counter = 0; counter < age; counter++) {
            if (candleHeights.get(counter) == tallestCandle) {
                amountOfCandlesBlownOut++;
            }
        }

        return amountOfCandlesBlownOut;
    }
}

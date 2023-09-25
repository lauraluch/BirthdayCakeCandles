import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BirthdayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your niece's birthday party ✨");

        System.out.println("Insert your niece's age: ");
        int niecesAge = scanner.nextInt();
        List<Integer> birthdayCandleHeights = new ArrayList<>();

        System.out.println("Insert the heights of all the candles from her birthday cake: ");
        for (int counter = 0; counter < niecesAge; counter++) {
            birthdayCandleHeights.add(scanner.nextInt());
        }

        BirthdayCakeCandles birthdayCake = new BirthdayCakeCandles(niecesAge, birthdayCandleHeights);

        System.out.println(
                "The amount of candles your niece will be able to blow out is: "
                        + birthdayCake.getAmountOfBlownOutCandles());
    }
}

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = sc.nextInt();
        sc.close();

        if (numFlips <= 0) {
            System.out.println("Number of flips must be a positive integer.");
            return;
        }

        int numHeads = 0; // Number of times heads comes up
        int numTails = 0; // Number of times tails comes up

        Random rand = new Random(); // Random object to simulate coin flips

        // Simulate coin flips
        for (int i = 0; i < numFlips; i++) {
            double coin = rand.nextDouble(); // Randomly generate a double between 0 and 1
            if (coin < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        // Calculate percentages
        double percentHeads = (double) numHeads / numFlips * 100;
        double percentTails = (double) numTails / numFlips * 100;

        // Print results
        System.out.println("Number of flips: " + numFlips);
        System.out.println("Number of heads: " + numHeads);
        System.out.println("Number of tails: " + numTails);
        System.out.println("Percentage of heads: " + percentHeads + "%");
        System.out.println("Percentage of tails: " + percentTails + "%");
    }
}

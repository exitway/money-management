import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        double total, score;
        double percentage;
        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Enter the total, or max, score : ");
        total = inputNumScanner.nextDouble();

        System.out.println("Enter the score obtained : ");
        score = inputNumScanner.nextDouble();

        percentage = (score * 100/ total);

        System.out.println("The percentage is = " + percentage + " %");

    }
}

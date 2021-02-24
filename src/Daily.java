import Utility.Helper;

import java.util.Scanner;

public class Daily {

    public static void main(String[] args) {

        double starting;
        float percentage;

        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Balance : ");
        starting = inputNumScanner.nextDouble();

        System.out.println("Profit Target Percentage : ");
        percentage = inputNumScanner.nextFloat();

        System.out.println();

        System.out.println("Starting : " + Helper.getFormattedCurrency(starting));
        System.out.println("Profit Target : " +percentage+ "%");
        System.out.println();

        double targetBalance = starting + (starting*(percentage/100));
        double lossLimit = starting - (starting * (percentage / 100));

        Helper.printDetails(starting, targetBalance, lossLimit);
    }


}

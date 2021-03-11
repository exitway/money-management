import Utility.Helper;

public class Monthly {

    public static void main(String[] args) {
        int day = 30;
        double starting = 150000000;
        float openPercentage = 1;
        float profitPercentage = 3;
        float lossPercentage = 20;
        double targetBalance = starting;
        double lossLimit;

        System.out.println("Starting Balance : " + Helper.getFormattedCurrency(starting));
        System.out.println("Open Percentage : " + openPercentage + "%");
        System.out.println("Target Percentage PerTrading : " + profitPercentage + "%");
        System.out.println("Max Loss Percentage : " + lossPercentage + "%");
        System.out.println();
        for (int i = 0; i < day; i++) {
            starting = targetBalance;
            targetBalance += (targetBalance * (profitPercentage / 100));
            lossLimit = starting - (starting * (lossPercentage / 100));
            System.out.println("Trading-#" + (i + 1));
            System.out.println("Current Balance =  " + Helper.getFormattedCurrency(starting));
            Helper.printDetails(starting, openPercentage, targetBalance, lossLimit);
            System.out.println();
        }
    }

}

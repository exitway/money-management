import Utility.Helper;

public class Monthly {

    public static void main(String[] args) {
        int day = 30;
        double starting = 1400000;
        float profitPercentage = 8;
        float lossPercentage = 20;
        double targetBalance = starting;
        double lossLimit;

        System.out.println("Starting : " + Helper.getFormattedCurrency(starting));
        System.out.println("Open nominal PerTrade: " + 1 + "%");
        System.out.println("Profit Target PerTrade: " + profitPercentage + "%");
        System.out.println("Max Loss PerTrade: " + lossPercentage + "%");
        System.out.println();
        for (int i = 0; i < day; i++) {
            starting = targetBalance;
            targetBalance += (targetBalance * (profitPercentage / 100));
            lossLimit = starting - (starting * (lossPercentage / 100));
            System.out.println("Day-" + (i + 1));
            System.out.println("Balance = " + Helper.getFormattedCurrency(starting));
            Helper.printDetails(starting, targetBalance, lossLimit);
        }
    }

}

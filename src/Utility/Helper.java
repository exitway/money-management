package Utility;

public class Helper {

    public static String getFormattedCurrency(double number) {
        return "IDR " + String.format("%,.2f", number);
    }

    static double k = 0;

    public static void printDetails(double starting, double profitTarget, double lossLimit) {
        double open = starting * (((float) 1) / 100);
        System.out.println("Open -> " + Helper.getFormattedCurrency(open));
        double target = profitTarget;
        double totalProfit = profitTarget - starting;
        double totalWin = totalProfit / (open * 0.8);
        double earning = 0;
        System.out.println("Target -> " + Helper.getFormattedCurrency(target) + " (+" + Helper.getFormattedCurrency(totalProfit) + ")");
        System.out.println("Profit Count : " + totalWin + " time(s)");
        for (int i = 0; i < (int) totalWin; i++) {
            earning += (open * 0.8);
            System.out.println("Round-"+i+" | Earning : "+Helper.getFormattedCurrency(earning));
        }
        System.out.println("Minimum Balance (Max Loss) -> " + Helper.getFormattedCurrency(lossLimit) + " (-" + Helper.getFormattedCurrency(starting * (((float) 20) / 100)) + ")");
        System.out.println("Compens : ");
        k = open * 2.5;
        System.out.println("K1 = " + Helper.getFormattedCurrency(k)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(k + (k*0.8)));
        k = k * 2.5;
        System.out.println("K2 = " + Helper.getFormattedCurrency(k)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(k + (k*0.8)));
        k = k * 2.5;
        System.out.println("K3 = " + Helper.getFormattedCurrency(k)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(k + (k*0.8)));
        k = k * 2.5;
        System.out.println("K4 = " + Helper.getFormattedCurrency(k)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(k + (k*0.8)));
        System.out.println();
    }

    private static void printFormat(String key, String value) {
        System.out.println(String.format(key + "%f", value));
    }

}

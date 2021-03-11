package Utility;

public class Helper {

    public static String getFormattedCurrency(double number) {
        return "IDR " + String.format("%,.2f", number);
    }

    public static void printDetails(double starting, float openPercentage, double profitTarget, double lossLimit) {
        double open = 0;
        double target;
        double totalProfit;
        double totalWin;
        double earning = 0;
        double profit = 0;

        double profitPercentage = 0.8;
        float lossPercentage = 20;
        double loss = 0;
        double compen = 0;
        double compenMultiplier = 2.2;


        open = starting * (openPercentage / 100);
        target = profitTarget;
        totalProfit = profitTarget - starting;
        totalWin = totalProfit / (open * profitPercentage);

        System.out.println("Open -> " + Helper.getFormattedCurrency(open));
        System.out.println("Target -> " + Helper.getFormattedCurrency(target) + " (+" + Helper.getFormattedCurrency(totalProfit) + ")");


        /* Print Profit Per Entry */
        System.out.println("Profit Count : " + (int) totalWin + " time(s)");
        boolean isFulfilled = false;
        int i = 1 ;
        while (!isFulfilled){
            if (earning < totalProfit) {
                earning += (open * profitPercentage);
                System.out.println("Ronde-" + i + " | Total Profit : " + Helper.getFormattedCurrency(earning));
            }else
                isFulfilled = true;
            i++;
        }
//        for (int j = 0; j < (int) totalWin; j++) {
//            earning += (open * profitPercentage);
//            System.out.println("Ronde-"+j+" | Total Profit : "+Helper.getFormattedCurrency(earning));
//        }
        /* End Print Profit Per Entry */

        System.out.println("Min Loss -> " + Helper.getFormattedCurrency(lossLimit) + " (-" + Helper.getFormattedCurrency(starting * (lossPercentage / 100)) + ")");
        System.out.println("Losses & Compensations :");
        loss=open;
//        System.out.println("Loss : "+getFormattedCurrency(loss));

        // K1
        compen = open * compenMultiplier;
//        loss+=compen;
        profit = compen + (compen*profitPercentage);
//        System.out.println("Loss : "+getFormattedCurrency(loss));
        System.out.println("C1 : " + Helper.getFormattedCurrency(compen)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(profit));

        // K2
        loss+=compen;
//        System.out.println("Profit - Total Loss : "+getFormattedCurrency(profit)+ " - "+getFormattedCurrency(loss)+ " = " + getFormattedCurrency((profit - loss)));
        compen = compen * compenMultiplier;
        profit = compen + (compen*profitPercentage);
//        System.out.println("Loss : "+getFormattedCurrency(loss));
        System.out.println("C2 : " + Helper.getFormattedCurrency(compen)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(profit));

        // K3
        loss+=compen;
//        System.out.println("Profit - Total Loss : "+getFormattedCurrency(profit)+ " - "+getFormattedCurrency(loss)+ " = " + getFormattedCurrency((profit - loss)));
        compen = compen * compenMultiplier;
        profit = compen + (compen*profitPercentage);
//        System.out.println("Loss : "+getFormattedCurrency(loss));
        System.out.println("C3 : " + Helper.getFormattedCurrency(compen)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(profit));
//        System.out.println("Profit - Total Loss : "+getFormattedCurrency(profit)+ " - "+getFormattedCurrency(loss)+ " = " + getFormattedCurrency((profit - loss)));

        //        k = k * compenMultiplier;
//        loss+=k;
//        System.out.println("K4 : " + Helper.getFormattedCurrency(k)+ " \t | \t Profit -> " + Helper.getFormattedCurrency(k + (k*profitPercentage)));
//        System.out.println("Loss : "+getFormattedCurrency(loss));

        System.out.println();
    }

    private static void printFormat(String key, String value) {
        System.out.println(String.format(key + "%f", value));
    }

}

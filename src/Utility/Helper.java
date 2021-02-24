package Utility;

public class Helper {

    public static String getFormattedCurrency(double number) {
        return "IDR " + String.format("%,.2f", number);
    }

    public static void printDetails(double starting, double profitTarget, double lossLimit) {
        System.out.println("Open -> " +Helper.getFormattedCurrency(starting * (((float) 1) / 100)));
        System.out.println("Target -> " +Helper.getFormattedCurrency(profitTarget) + " (+" +Helper.getFormattedCurrency(profitTarget-starting) + ")");
        System.out.println("Minimum Balance (Max Loss) -> " +Helper.getFormattedCurrency(lossLimit)  + " (-" +Helper.getFormattedCurrency(starting * (((float) 20) / 100)) + ")");
        System.out.println("Compens : ");
        System.out.println("K1 = " +Helper.getFormattedCurrency((starting * (((float) 1) / 100)) * 2.5));
        System.out.println("K2 = " +Helper.getFormattedCurrency((starting * (((float) 1) / 100)) * 4));
        System.out.println("K3 = " +Helper.getFormattedCurrency((starting * (((float) 1) / 100)) * 6));
        System.out.println();
    }

    private static void printFormat(String key, String value){
        System.out.println(String.format(key+"%f", value));
    }

}

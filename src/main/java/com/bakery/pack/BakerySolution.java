package com.bakery.pack;

public class BakerySolution {
    private static final int[] packageArr = { 9, 5, 3 };  // no of packages

    private static String finalOutput = null;
    private static final int totalInput = 34; // number of orders

    public static void main(String[] args) {
        System.out.println(calculateOutput(totalInput));
    }

    public static String calculateOutput(int totalInputOrder) {
        find(totalInputOrder, 0, "");
        return finalOutput.substring(1);
    }

    private static void find(int totalInputOrder, int i, String str) {
        if (totalInputOrder == 0) {
            finalOutput = str;
        }
        if (totalInputOrder < 0) {
            return;
        }

        for (int j = i; j < packageArr.length; j++) {
            if (finalOutput == null)
                find(totalInputOrder - packageArr[j], j, str + "," + packageArr[j]);
        }
    }
}

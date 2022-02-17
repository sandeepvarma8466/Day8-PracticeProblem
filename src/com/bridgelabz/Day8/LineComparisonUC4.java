package com.bridgelabz.Day8;

public class LineComparisonUC4 {
    public static void main(String[] args) {
        String x1 = "5";
        String x2 = "5";
        String y1 = "8";


        String y2 = "5";
        String xy = new String("x1");

        //Comparing
        System.out.println(x1 +" .compareTo " + x2 + " : " + x1.compareTo(x2));
        System.out.println(x1 +" .compareTo " + y1 + " : " + x1.compareTo(y1));
        System.out.println(x2 +" .compareTo " + y1 + " : " + y2.compareTo(y2));
        System.out.println(x1 +" .compareTo " + y2 + " : " + x1.compareTo(y2));
    }
}

/*
    UCF COP3330 Fall 2021 Assignment 12 Solution
    Copyright 2021 Luke Faulkner
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // Variables
        String pStr, rStr, yStr;
        int principal;
        double rate, years;
        Scanner interestScanner = new Scanner(System.in);

        // Prompt
        System.out.print("Enter the principal: ");
        pStr = interestScanner.nextLine();
        int p = Integer.parseInt(pStr);

        System.out.print("Enter the rate of interest: ");
        rStr = interestScanner.nextLine();
        double r = Double.parseDouble(rStr);

        System.out.print("Enter the number of years: ");
        yStr = interestScanner.nextLine();
        int y = Integer.parseInt(yStr);

        // Calc
        double interest = (double)p * (1 + (r/100) * (double)y);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // Output
        System.out.print("After " + y + " years at " + r + "%, the investment will be worth $" + df.format(interest));
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital;
        double yearlyInterest;
        int numYears;

        System.out.println("please enter initial capital :");
        startCapital = in.nextDouble();
        System.out.println("Enter the annual interest rate in %");
        yearlyInterest = in.nextDouble();
        System.out.println("Please enter the number of years");
        numYears = in.nextInt();

        double FinalCapital = startCapital * Math.pow((1 + (yearlyInterest / 100.0d)),numYears);
          double rounded_result=Math.round(FinalCapital*100);
        rounded_result/=100;
        System.out.println("your result equals : "+rounded_result);

    }
}

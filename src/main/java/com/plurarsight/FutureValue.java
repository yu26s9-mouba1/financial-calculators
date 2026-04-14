package com.plurarsight;
import java.util.Scanner;


public class FutureValue {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //Prompting the user for inputs
         System.out.print("Enter the deposit amount: ");
         double principal = scanner.nextDouble();

         System.out.print("Enter the annual interest rate (e.g. 1.75): ");
         double annualRate = scanner.nextDouble();

         System.out.print("Enter the number of years: ");
         int years = scanner.nextInt();

         //Now, converting percentages to decimal
         double rateDecimal = annualRate / 100;

         //Setting up the daily compounding
         int daysPerYear = 365;
         int totalDays = daysPerYear * years;

         // Setting the future Value formula
         double futureValue = principal *
                 Math.pow(1 + (rateDecimal / daysPerYear), totalDays);

         //Now, calculating the total interest earned by the custumer
         double totalInterest = futureValue - principal;








     }
}

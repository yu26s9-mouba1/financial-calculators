package com.plurarsight;
import java.util.Scanner;
public class MorgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       // Prompting the user for inputs #Principal
        System.out.println("Hi, what is your principal?");
        double principal = scanner.nextDouble();

        // Interest rate
        System.out.println("what is your annual interest rate?" );
        double annualInterestRate = scanner.nextDouble();

        //Loan Lenght
        System.out.println("What is your loan term in years?");
        int LoanTermYears = scanner.nextInt();


         // Creating formulas that would allow the calculator to calculate inputs from user
        double monthlyInterestRate = (annualInterestRate/100) / 12;
        int numberOfPayments = LoanTermYears * 12;

        double monthlyPayment = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                        (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        double totalInterest = (monthlyPayment * numberOfPayments) - principal;

      //Now printing outputs base on the user inputs and calculations

        System.out.println();
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

        scanner.close();
















    }
}

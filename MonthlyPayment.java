package com.blz.programforjunittesting;

import java.util.Scanner;

public class MonthlyPayment {
    public static double monthlyPayment(double P, double R, double Y){
        double payment, r, n;
        n = 12 * Y;
        r = R / ( 12 *100);
        payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        return payment;
    }
    public static void main(String[] args) {
        int P, R, Y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the loan Principal Amount : ");
        P = scan.nextInt();
        System.out.println("Enter the Monthly Interest Rate : ");
        R = scan.nextInt();
        System.out.println("Enter the Year to pay off : ");
        Y = scan.nextInt();
        System.out.println("Monthly Payment is : " + monthlyPayment(P, R, Y));
    }
}

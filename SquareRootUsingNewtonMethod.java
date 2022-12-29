package com.blz.programforjunittesting;

import java.util.Scanner;

public class SquareRootUsingNewtonMethod {
    public static void main(String[] args) {
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Non-Negative Number : ");
        c = scan.nextInt();
        double t = c;
        double epsilon;
        epsilon = 1e-15;
        do {
            t = ((c / t) + t) / 2;
        }while (Math.abs(t - (c/t)) > epsilon * t);
        System.out.println("Square root of " + c + " is : " + t);
    }
}

package com.blz.programforjunittesting;

import java.util.Scanner;

public class GregorianCalendar {

    public static int dayOfWeek(int d, int m, int y) {
        int x,y1,m1,d1;
        y1 = y - (14 - m) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m1 = m + 12 * ((14 - m) / 12) - 2;
        d1 = (d + x + ((31 * m1) / 12)) % 7;
        return d1;
    }

    public static void main(String[] args) {
        int m, d, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Date : ");
        d = scan.nextInt();
        System.out.println("Enter the Month (in number) : ");
        m = scan.nextInt();
        System.out.println("Enter the Year : ");
        y = scan.nextInt();
        switch (dayOfWeek(d, m, y)) {
            case 1:
                System.out.println("On " + d + " / " + m + " / " + y +" is Monday");
            case 2:
                System.out.println("On " + d + " / " + m + " / " + y +" is Tuesday");
            case 3:
                System.out.println("On " + d + " / " + m + " / " + y +" is Wednesday");
            case 4:
                System.out.println("On " + d + " / " + m + " / " + y +" is Thursday");
            case 5:
                System.out.println("On " + d + " / " + m + " / " + y +" is Friday");
            case 6:
                System.out.println("On " + d + " / " + m + " / " + y +" is Saturday");
            case 0:
                System.out.println("On " + d + " / " + m + " / " + y +" is Sunday");
        }
    }
}

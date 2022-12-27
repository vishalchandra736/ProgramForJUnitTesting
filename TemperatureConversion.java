package com.blz.programforjunittesting;

import java.util.Scanner;

public class TemperatureConversion {

    public static void celsiusToFahrenheit(int C) {
        int F;
        F = C * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit is : " + F + "F");
    }

    public static void fahrenheitToCelsius(int F) {
        int C;
        C = (F - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is : " + C + "C");
    }

    public static void main(String[] args) {
        int choose, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the option : ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        choose = scan.nextInt();
        System.out.println("Enter the temperature : ");
        temp = scan.nextInt();
        if(choose == 1)
            celsiusToFahrenheit(temp);
        else
            fahrenheitToCelsius(temp);
    }
}

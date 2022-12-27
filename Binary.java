package com.blz.programforjunittesting;

import java.util.Map;
import java.util.Scanner;

public class Binary {
    public static int toBinary(int num) {
        int binary[] = new int[8];
        int reverse[] = new int[8];
        int temp, index = 0, binaryInNum = 0;
        System.out.print(num + " was converted into binary : " );
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        index = 0;
        for (int i=binary.length-1; i>=0; i--) {
            reverse[index++] = binary[i];
        }
        for (int i=0; i<reverse.length; i++) {
            System.out.print(reverse[i]);
        }
        for (int i=0; i<reverse.length/2; i++) {
            temp = reverse[i];
            reverse[i] = reverse[i + (reverse.length / 2)];
            reverse[i+ (reverse.length / 2)] = temp;
        }
        System.out.println();
        for(int i=0; i<reverse.length; i++) {
            binaryInNum = (binaryInNum * 10) + (reverse[i] % 2);
        }
        System.out.println("Swap the octet, New Binary Number is : " + binaryInNum);
        return binaryInNum;
    }
    public static void binaryToDecimal(int binary) {
        int decimal = 0;
        int temp, n = 0;
        while(binary != 0) {
            temp = binary % 10;
            decimal = (int)(decimal + temp * Math.pow(2,n++));
            binary = binary / 10;
        }
        System.out.println("After swap, New Decimal is  : " + decimal);
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        binaryToDecimal(toBinary(num));
    }
}

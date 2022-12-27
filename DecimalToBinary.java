package com.blz.programforjunittesting;

import java.util.Scanner;

public class DecimalToBinary {
    public static void toBinary(int num) {
        int binary[] = new int[32];
        int index = 0;
        System.out.print(num + " was converted into binary : " );
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i=index-1; i>=0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = scan.nextInt();
        toBinary(num);
    }
}

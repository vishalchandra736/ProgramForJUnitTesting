package com.blz.programforjunittesting;

import java.util.Scanner;

public class NotesVendingMachine {
    public static void changeNotes(int rupee) {
        int count = 0, note[] = new int[8];
        int amount[] = {1000, 500, 100, 50, 10, 5, 2, 1};
        while(rupee > 0) {
            if (rupee >= amount[0]) {
                rupee -= 1000;
                note[0]++;
            } else if (rupee >= amount[1]) {
                rupee -= 500;
                note[1]++;
            } else if (rupee >= amount[2]) {
                rupee -= 100;
                note[2]++;
            } else if (rupee >= amount[3]) {
                rupee -= 50;
                note[3]++;
            } else if (rupee >= amount[4]) {
                rupee -= 10;
                note[4]++;
            } else if (rupee >= amount[5]) {
                rupee -= 5;
                note[5]++;
            } else if (rupee >= amount[6]) {
                rupee -= 2;
                note[6]++;
            } else if (rupee >= amount[7]) {
                rupee -= 1;
                note[7]++;
            }
        }
        for (int i=0; i<8; i++)
            count += note[i];
        System.out.println("Minimum Number of Notes count  : " + count);
        for (int i=0; i<8; i++)
            System.out.println("No of " + amount[i] + "rs Note : " + note[i]);
    }
    public static void main(String[] args) {
        int rs;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Rupees to change : ");
        rs = scan.nextInt();
        changeNotes(rs);
    }
}

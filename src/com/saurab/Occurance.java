package com.saurab;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = input.nextLong();
        long rem= 0,c=0;
        while(num != 0){
            rem = num % 10;
            if(rem == 7){
                c = c + 1;
            }
            num = num / 10;
        }
        System.out.println("Occurence of 7 is " + c);
    }
}
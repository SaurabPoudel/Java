package com.saurab;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum = sum + i;
            }
        }
        if(sum == a){
            System.out.println("Perfect Number.");
        }else{
            System.out.println("Not a perfect number.");
        }
    }
}

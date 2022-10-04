package com.saurab;

import java.util.Scanner;

public class productsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int product=1;
        int sum=0;
        int difference;

        while(n!=0){
            int rem=0;
            rem=n%10;
            product=product*rem;
            sum=sum+rem;
            n=n/10;

        }
        difference=product-sum;

        System.out.println(difference);
    }
}

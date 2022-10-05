package com.saurab;

import java.util.Scanner;

public class NPr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (n)");
        int n = input.nextInt();
        System.out.println("Enter another number (r");
        int r = input.nextInt();
        int ans= 1;
        for(int i=(n-r+1);i<=n;i++){
            ans = ans*i;
        }
        System.out.println("nPr is"+ ans);
    }
}


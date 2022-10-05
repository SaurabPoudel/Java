package com.saurab;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b= input.nextInt();
        int hcf=0;
        for(int i=1;i<=a || i<=b;i++){
            if(a %i == 0 && b %i == 0){
                hcf = i;
            }
        }
        System.out.println("LCM  is "+ (a*b)/hcf);
    }

}

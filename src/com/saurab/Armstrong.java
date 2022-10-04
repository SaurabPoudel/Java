package com.saurab;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a range [num1-num2]: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i=num1; i< num2 ; i++){
            int rem=0,arm=0,temp;
            temp = i;
            while (temp!=0){
                rem = temp % 10;
                arm = (rem*rem*rem) + arm;
                temp = temp/10;
            }
            if(i == arm){
                System.out.println(arm);
            }
        }
    }
}

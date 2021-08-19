package com.saurab;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        int a,b,sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number1");
        a = in.nextInt();
        System.out.println("Enter a number 2");
        b = in.nextInt();
        sum = a+b;
        System.out.println("The sum is " +sum);
    }
}

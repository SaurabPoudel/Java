package com.saurab;
import java.util.Scanner;
/*
previously I have created void function which are commented below. Now we have a function which can return
 integer value
 */

public class Sum {
    public static void main(String[] args) {
        int z= add();
        System.out.println(z);
    }

    static int add(){
        int a,b,sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number1");
        a = in.nextInt();
        System.out.println("Enter a number 2");
        b = in.nextInt();
        sum = a+b;
        return sum;
    }
//    static void sum(){
//        int a,b,sum;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter a number1");
//        a = in.nextInt();
//        System.out.println("Enter a number 2");
//        b = in.nextInt();
//        sum = a+b;
//        System.out.println("The sum is " +sum);
//    }
}

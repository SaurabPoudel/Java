package saurab;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle:");
        float principle = input.nextFloat();
        System.out.println("Enter time:");
        float time = input.nextFloat();
        System.out.println("Enter rate:");
        float rate = input.nextFloat();
        System.out.println("Simple Interest is = " + (principle * time * rate)/100);
    }
}

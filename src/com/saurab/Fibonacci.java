package saurab;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Up to which term do u wanna display? ");
        int n = input.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i = 1;i<n;i++)
        {
            a = b;
            b = c;
            c= a + b;
            System.out.println(a);

        }
    }
}

package saurab;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type casting
        int num = (int)(34.45f);
        System.out.println(num);
        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);
    }
}

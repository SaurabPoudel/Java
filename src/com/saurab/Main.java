package com.saurab;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int day = in.nextInt();


        switch (day) {
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
                return;
            case 3:
                System.out.println("Tuesday");
                return;
            case 4:
                System.out.println("Wednesday");
                return;
            case 5:
                System.out.println("Thursday");
                return;
            case 6:
                System.out.println("Friday");
                return;
            case 7:
                System.out.println("Saturday");
                return;
            default:
                System.out.println("Enter valid number");
                break;
        }
    }
}

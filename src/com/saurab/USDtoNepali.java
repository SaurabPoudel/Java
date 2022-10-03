package saurab;

import java.util.Scanner;

public class USDtoNepali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USD:");
        float usd = input.nextFloat();
        float nepali = usd * 129.77f;
        System.out.println("NEpali Currency is :" + nepali);
    }
}

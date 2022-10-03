package saurab;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String myString = input.next();
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
}

package saurab;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Enter a operator  (+, -, *, /)");
        char op = input.next().charAt(0);
        int ans = 0;
        if(op == '+'){
            System.out.println("Sum is " + (number1 + number2));
        } else if (op == '-') {
            System.out.println("Difference is " + (number1 - number2));
        }else if (op == '*') {
            System.out.println("Multiplication is  is " + (number1 * number2));
        }
        else if (op == '-') {
            System.out.println("Division is " + (number1/number2));
        }
    }
}

import java.util.Scanner;

public class Function_1 {
    public static void main(String[] args) {
        // Q:Take input of two numbers and print the sum without using function
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Sum is "+ (num1 + num2));
    }
}

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
//        static void sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number 1:");
//        int num1 = input.nextInt();
//        System.out.println("Enter number 2");
//        int num2 = input.nextInt();
//        System.out.println("Sum is "+ (num1 + num2));
//    }
    static int sum() {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter number 1:");
       int num1 = input.nextInt();
       System.out.println("Enter number 2");
        int num2 = input.nextInt();
       return num2 + num1;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String fruit = input.next();
        switch(fruit){
            case "mango":
                System.out.println("King of fuit");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
            default:
                System.out.println("Dont know");

        }
    }
}
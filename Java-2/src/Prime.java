import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

     static boolean isPrime(int num) {
        if(num==1){
            return false;
        }
        for(int i= 2; i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

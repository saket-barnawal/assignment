import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        if(num%2==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}

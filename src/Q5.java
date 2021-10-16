import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Num1:");
        int num1=in.nextInt();
        System.out.println("Enter the Num2:");
        int num2=in.nextInt();
        if(num1>num2) {
            System.out.println("The largest number is: "+num1);
        }
        else {
            System.out.println("The largest number is: "+num2);
        }
    }
}

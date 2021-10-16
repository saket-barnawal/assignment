import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char op=in.next().charAt(0);
        System.out.println("Enter the number 1: ");
        double num1=in.nextDouble();
        System.out.println("Enter the number 2: ");
        double num2=in.nextDouble();
        if(op == '+') {
            System.out.println("The result is:"+ num1+num2);

        }
        if(op == '-') {
            System.out.println("The result is:" + (num1-num2));

        }
        if(op == '*') {
            System.out.println("The result is:" +num1*num2);

        }
        if(op == '/') {
            System.out.println("The result is:" + num1/num2);

        }


    }
}

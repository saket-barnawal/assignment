import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of principal: ");
        double p=in.nextDouble();
        System.out.println("Enter the time : ");
        float t=in.nextFloat();
        System.out.println("Enter the rate: ");
        float r=in.nextFloat();
        double simpleInterest=(p*t*r)/100;
        System.out.println(simpleInterest);
    }
}

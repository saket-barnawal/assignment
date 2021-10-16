import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency in Rupees: ");
        int indianrupees=in.nextInt();
        double us_dollar=indianrupees/74.22;
        System.out.println("US_Dollar: "+us_dollar);
    }
}

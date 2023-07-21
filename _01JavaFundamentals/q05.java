//B) Given two non—negative int values, print true if they have the same last digit, such as
//with 27 and 57.
//lastDigit (7,17)  true
//lastDigit (6,17) false
//lastDigit (3,113) true
import java.util.Scanner;
public class q05 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Check whether the last digits are same");
        System.out.print("Enter two numbers: ");
       int a = in.nextInt();
       int b = in.nextInt();
        if( (a>0) && (b>0)) {

            String x = "" + a;
            String y = "" + b;

            if (x.charAt(1) == y.charAt(1))
                System.out.println("True");

            else
                System.out.println("False");
        }
    }
}

//Write a Program to accept two integers as command line arguments and print the sum of the
//two numbers
//Example 1)
//C: Sample 10 20
//O/ P Expected : The sum of 10 and 20 is 30
public class q03 {
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.print("The sum of " + a + " and " +b + " is " + (a+b));
    }
}

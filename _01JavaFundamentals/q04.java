//A) Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.*;
public class q04 {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("To check Positive, Negative, or Zero");
        System.out.print("Input a number: ");
        int a = in.nextInt();
        if(a > 0)
            System.out.println(a + " is positive");
        else if (a<0)
            System.out.println(a +" is negative");
        else if (a==0)
            System.out.println(a + " is Zero");
//        else
//            System.out.println("Please enter only numerical values");
    }
}

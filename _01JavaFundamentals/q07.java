//Initialize two character variables in a program and display the characters in alphabetical order.
//Example 1) if the first character is e and second character is s the output should be e,s

import java.util.Scanner;
public class q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Displaying elements in alphabetical order....");
        System.out.println("Enter two characters");
        char one = in.next().charAt(0);
        char two = in.next().charAt(0);

        if(one > two)
            System.out.print(two + "," + one);

        else
            System.out.print(one + "," + two);

    }
}

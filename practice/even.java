//diff btn sum of odd and even numbers from array of integers

import java.util.*;
public class even {
    public static void main(String [] args)
    {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int [] arr = new int[n];

    for(int i =0;i<n;i++)

        arr[i] = in.nextInt();

int evensum=0;
int oddsum=0;

    for(int i : arr)
    {
        if(i%2==0)
            evensum+=arr[i];
        else 
            oddsum += arr[i];
    }

    System.out.print("Difference between even and odd numbers is " + (oddsum-evensum));
}}

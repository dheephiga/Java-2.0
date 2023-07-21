//Write a program to check if the program has received If the program has not received arguments then print
//in a single line separated by , (comma) Examplel) java Example
//O/ P: No values
//Example2) java Example Mumbai Bangalore
//O/ P: Mumbai, Bangalore
//else print all the values
public class q06 {
    public static void main(String[] args) {
        if(args.length == 0)
            System.out.println("No values");
        else
        {
            System.out.print(args[0]);
            for(int i =1; i<args.length;i++)
                System.out.print(","+args[i]);
        }
    }
}

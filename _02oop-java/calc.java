import java.util.Scanner;
class addition{
    int a;
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
public class calc {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition through classes");
        System.out.print("Input two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        addition l = new addition();
        int result = l.add(a,b);
        System.out.println("The sum is " +result);
    }
}
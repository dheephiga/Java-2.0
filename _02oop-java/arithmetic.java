import java.util.Scanner;

class calculating{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}

public class arithmetic {
    public static void main(String[] args) {
        calculating num = new calculating();
        System.out.println(num.add(1,2,3));
    }
}

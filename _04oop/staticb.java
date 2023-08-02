class sample
{
    sample()
    {
        System.out.println("Within constructor");
    }

    static
    {
        System.out.println("Within first static");
    }

    static void m1()
    {
        System.out.println("M1 method");
    }

    static {
        System.out.println("Within second static");
        m1();
    }
}
public class staticb {
    public static void main(String[] args) {
        System.out.println("within main");
        System.out.println();
        sample sc = new sample();
    }

    }


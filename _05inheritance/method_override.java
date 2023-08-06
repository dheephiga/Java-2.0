class parent{
    public  int sum2(int a, int b)
    {
        return a+b;
    }
}

class child extends parent{
    public int sum2(int a, int b)
    {
        return a+b+1;
    }
} // prints 8 since it overrides the parent function, if commented -> will produce input as 7
public class method_override {
    public static void main(String[] args) {
        child summing = new child();
        System.out.print(summing.sum2(5,2));
    }
}

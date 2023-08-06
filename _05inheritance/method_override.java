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
}
public class method_override {
    public static void main(String[] args) {
        child summing = new child();
        summing.sum2(5,2);
    }
}

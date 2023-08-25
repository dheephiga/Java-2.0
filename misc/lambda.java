interface lamb{
   // void show();
    int withparam(int i);
}
public class lambda {
    public static void main(String[] args) {
        lamb n = (a) -> a+8;
        int r = n.withparam(9);
        System.out.println(r);
    }
}

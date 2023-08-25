interface lamb{
    void show();
}
public class lambda {
    public static void main(String[] args) {
        lamb n = () -> System.out.println("hello this is lambda ");
        n.show();
    }
}

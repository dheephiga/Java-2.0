class hi{
    public void show()
    {
        for(int i =0;i<10;i++)
            System.out.println("Hi");
    }
}
class hello{
    public void show()
    {
        for(int i =0;i<10;i++)
            System.out.println("Hello");
    }
}
public class threds{
    public static void main(String[] args) {
        hi hey = new hi();
        hello heyy = new hello();

        hey.show();
        heyy.show();
    }
}
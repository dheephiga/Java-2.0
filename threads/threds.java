class hi extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++)
            System.out.println("Hi");
    }
}
class hello extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++)
            System.out.println("Hello");
    }
}
public class threds{
    public static void main(String[] args) {
        hi hey = new hi();
        hello heyy = new hello();

    //    System.out.println(hey.getPriority());
        heyy.setPriority(Thread.MAX_PRIORITY);
        hey.start();
        heyy.start();
    }
}
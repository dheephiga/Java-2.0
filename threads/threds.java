class hi extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
             //   e.printStackTrace();
              throw new RuntimeException(e);

            }

        }
    }
}
class hello extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
public class threds{
    public static void main(String[] args) {
        hi hey = new hi();
        hello heyy = new hello();

     System.out.println(hey.getPriority());
       // heyy.setPriority(Thread.MAX_PRIORITY);
        hey.start();
        try {
            hey.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        heyy.run();
  //      hey.
    }
}
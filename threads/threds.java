class Am extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class Bm extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class threds  {
    public static void main(String[] args) throws NumberFormatException {

        Am obj1=new Am();
        Bm obj2=new Bm();
      //  obj1.show();
//    	obj2.show();

        obj1.start();
        obj2.start();
    }

}

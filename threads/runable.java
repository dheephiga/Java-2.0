//class ar implements Runnable{
//    public void run() {
//        for(int i =0;i<5;i++)
//            System.out.println("hello");
//        try {
//            Thread.sleep(2);
//        }
//        catch(InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

//class br implements Runnable{
//    public void run()
//    {
//        for (int i = 0;i<5;i++) {
//            System.out.println("Hi");
//            try{
//                Thread.sleep(10);
//            }
//            catch(InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
public class runable {
    public static void main(String[] args) {
       Runnable obj1 = () -> {

                   for(int i = 0; i < 5; i++)
               {
                   System.out.println("Hello");

                   try{Thread.sleep(2); } catch(InterruptedException e) { e.printStackTrace();}
               }

       };

       Runnable obj2 = () -> {

               for(int i =0;i<5;i++)
               {
                   System.out.println("hi");
                   try{
                       Thread.sleep(5);
                   }
                   catch(InterruptedException e)
                   {
                       e.printStackTrace();
                   }
               }
       };
       Runnable obj3 = new Runnable() {
           @Override
           public void run() {

           }
       };
//       ar obj1 = new ar();
//       br obj2 = new br();
//
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

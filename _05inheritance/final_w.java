final class fin{
    //this class cannot be inherited anymore
    public void fun()
    {
        System.out.println("Just a method");
    }
}

//class fine extends fin{
//    //throws error over here, once you uncomment it
//}
public class final_w {
    public static void main(String[] args) {
        //final variable
        int var = 0;
        var = 800; //no error

        final int ar = 3948;
      //  ar = 93839; //throws  error

    }
}

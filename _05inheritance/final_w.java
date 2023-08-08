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

//class which cannot be overridden can be created using final keyword

class fren{
    final public void pb(){
        System.out.println("the function with final keyword");
    }
}

class frun extends fren{
//    public void pb(){
//        //throws error while you uncomment
//    }
}
public class final_w {
    public static void main(String[] args) {
        //final variable
        int var = 0;
        var = 800; //no error

        final int ar = 3948;
      //  ar = 93839; //throws  error

    }
}

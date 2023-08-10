class Al{
    void show()
    {
        System.out.println("Inside A class, show method");
    }

    static class Bn{
        void config()
        {
            System.out.println("Inside inner class");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
      //  Al ob = new Bn(); //error
     //   ob.config();
        Al ob = new Al();
        ob.show();

     //   Al.Bn obj  = ob.new Bn(); only if class is not static
        //or
        Al.Bn obj1 = new Al.Bn(); //only if class is static
    }
}

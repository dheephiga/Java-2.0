//polymorphism
class a{
    public void show()
    {
        System.out.println("In A class");
    }
}

class b extends  a{
    public void show(){
        System.out.println("In B class");
    }
}
public class dynamic {
    public static void main(String[] args) {
        a obj = new a();
        //here what we do is create an object of type a and object is a
        obj.show(); //must print In A class

        obj = new b();
        // we can map the reference variable to another object
        obj.show();
        //must print In B class


    }
}

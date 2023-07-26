//a constructor has the class name as the method name, it returns nothing, everytime object is created, it is called by default
class user{
    String name;
    int age;

    public user()
    {
        System.out.println("constructor called");
    }
}
public class constr {
    public static void main(String[] args) {
        user us1 = new user();
    }
}

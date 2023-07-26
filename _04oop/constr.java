//a constructor has the class name as the method name, it returns nothing, everytime object is created, it is called by default
class user{
    String name;
    int age;

    public user()
    {
       // System.out.println("constructor called");
        age = 18;
        name = "John Doe";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class constr {
    public static void main(String[] args) {
        user us1 = new user();
        System.out.println(us1.getAge() + " : " + us1.getName());
    }
}

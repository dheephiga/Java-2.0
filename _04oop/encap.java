class details{
    String name;
    private int age;

    public void setAge(int a){
        age = a;
    }

    public void show(details o){
        System.out.println(o.name);
        System.out.println(o.age);
    }
}

public class encap {
    public static void main(String [] args)
    {
        details d1 = new details();
    d1.setAge(34);
        d1.name = "D";
        d1.show(d1);
    }
}

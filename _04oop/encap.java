class details{
    String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName(){
        return name;
    }

//    public void show(details o){
//        System.out.println(o.name);
//        System.out.println(o.age);
//    }
}

public class encap {
    public static void main(String [] args)
    {
        details d1 = new details();
        d1.setName("D");
    d1.setAge(34);
        System.out.println(d1.getAge() + " : " + d1.getName());;
//        d1.name = "D";
//        d1.show(d1);
    }
}

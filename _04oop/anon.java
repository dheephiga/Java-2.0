class an{
    an()
    {
        System.out.println("Anonymous object created");
    }
    public void showan(){
        System.out.println("inside show function");
    }
}
public class anon {
    public static void main(String[] args) {
        new an().showan();
        new an();
    }
}

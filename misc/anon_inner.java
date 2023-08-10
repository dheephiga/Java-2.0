class anonymous{
    public void display()
    {
        System.out.println("In parent class ");
    }
}

public class anon_inner {
    public static void main(String[] args) {
    anonymous any = new anonymous();
        {
            System.out.println("overriding above method");
        }
    }
}

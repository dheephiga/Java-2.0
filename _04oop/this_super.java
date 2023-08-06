class Aa{
public Aa(){
    System.out.println("inside A");
}
}

class Bb extends Aa{
public Bb(){
  // this();
    System.out.println("inside B");
}
public Bb(int n)
{
  //this();
    System.out.println("int B");
}
}
public class this_super {
    public static void main(String[] args) {

        Bb obj = new Bb();
    }
}

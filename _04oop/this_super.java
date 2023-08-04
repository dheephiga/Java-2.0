class Aa{
public Aa(){
    System.out.println("inside A");
}
}

class Bb extends Aa{
public Bb(){
    System.out.println("inside b block");
}
}
public class this_super {
    public static void main(String[] args) {
        Bb obj = new Bb();
    }
}

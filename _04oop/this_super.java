class Aa{

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

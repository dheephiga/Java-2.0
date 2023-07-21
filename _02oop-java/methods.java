import java.util.Scanner;

class test{
    public void playMusic()
    {
        System.out.println("Music is playing...");
    }
    public String getPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Unavailable";
    }
}
public class methods {
    public static void main(String [] args) {
        test test1 = new test();
        test1.playMusic();
       String result = test1.getPen(5);
       // String result = test1.getPen(45);
        System.out.println(result);
    }

}

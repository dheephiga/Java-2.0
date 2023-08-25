abstract class All
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }

    public abstract void showTheDataWhichBelongToThisClass();
}

class Bl extends All
{
@Override
    public void showTheDataWhichBelongToThisClass()

    {
        System.out.println("in show B");
    }
}
public class overr {
    public static void main(String[] args) {
        Bl obj=new Bl();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

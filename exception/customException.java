import java.lang.reflect.Array;

class myException{
    public myException(String s)
    {

    }
}
public class customException {
    public static void main(String[] args) {
        int[] a = new int[8];
        int j = 9;
        try {

            System.out.println(a[j]);

            if (a.length < j)
                throw new ArrayIndexOutOfBoundsException("Cannot access");
        } catch (ArrayIndexOutOfBoundsException l) {
            System.out.println(a[j - 1]);
        }
    }
}

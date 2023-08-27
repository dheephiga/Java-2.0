class myException extends Exception {
    public myException(String s)
    {
        super(s);
    }
}
public class customException {
    public static void main(String[] args) {
        int[] a = new int[8];
        int j = 9;
        try {
            if (a.length < j)
            //    throw new ArrayIndexOutOfBoundsException("Cannot access");
                throw new myException("unable to find element");
        } catch ( myException l) {
            System.out.println(a[j - 5]);
        }
    }
}

import java.util.*;

public class matchstring {
   public static int match(int len1, int len2, String a, String b, int k1, int k2)
    {

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        int len1 = a.length();
        int len2 = b.length();

        int k = in.nextInt();
        int k1 = in.nextInt();

        int res = match(len1,len2,a,b,k,k1);
        System.out.println(res);
    }
}

succeed 4
crossbreed 7

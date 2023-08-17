import java.util.*;
public class pw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = in.next();

            if((pass.charAt(0) <= '9') && (pass.charAt(0) >= '0') || (pass.length()<4))
                System.out.println("no");

            else {

                for (int i = 0; i < pass.length(); i++)
                {
                    if((pass.charAt(i) <= '9') && (pass.charAt(i) >= '0'))
                        num++;
                    if(pass.charAt(i) <= 'Z' || pass.charAt(i) >= 'A')
                        cap++;

                }
            }




    }
}

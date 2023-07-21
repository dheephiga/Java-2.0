//Initialize a character variable in a program and print
//' Alphabet' if the initialized value is an alphabet,
//'Digit' if the initialized value is a number, and
//' Special Character '
//if the initialized value is anything else.
import java.util.Scanner;
public class q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);

        if((a >=48) && (a<=57))
            System.out.println("Digit");
        else if (((a>=97) && (a<=122)) || ((a>=65) && (a<=90)))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}

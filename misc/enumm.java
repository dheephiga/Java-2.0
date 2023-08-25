import java.util.*;
enum status {
    running,pending,failed, success;
}
public class enumm {
    public static void main(String[] args) {
        int i = 8;
        status [] s = status.values();
        System.out.println(s);
        for(status a : s)
            System.out.println(a);

        //enum with switch
    status ss = status.success;
    //input from user
        Scanner in = new Scanner(System.in);
        status su = status.valueOf(in.next());
        switch (su) {
            case running -> System.out.println("all good");
            case pending -> System.out.println("Waiting");
            case failed -> System.out.println("Try again");
            case success -> System.out.println("Perfect");
            default -> System.out.println("Invalid");
        }
    }
}

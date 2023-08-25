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
    }
}

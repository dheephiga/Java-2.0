import java.io.*;
public class in {
    public static void main(String[] args) throws IOException {
        FileOutputStream s = new FileOutputStream("test.txt");
        s.write(80);
        s.close();
    }
}

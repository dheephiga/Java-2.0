import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        List <Integer> num = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int i;
        while (in.hasNext())
        {
            if(in.hasNextInt()) {
               num.add(in.nextInt());
            }
        }
      //  for(int x : num)
            System.out.println(num);
    }
}

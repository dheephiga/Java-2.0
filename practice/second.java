import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <Integer>  even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        int [] maj = new int[n];

        for(int i=0;i<n;i++)
            maj[i] = in.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println(maj[i] + " ");
        }
        for(int i = 0;i<n;i++)
        {
            if(i%2==0)
                even.add(maj[i]);
            else
                odd.add(maj[i]);

        }
        Collections.sort(odd);
        Collections.sort(even);
        int oddsec = odd.get(odd.size()-2);
        int evensec = even.get(even.size()-2);

        System.out.println(oddsec+evensec);
    }
}

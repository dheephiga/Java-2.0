import java.util.*;
public class sort {
    public static void main(String[] args) {
        int [] arr = new int [8];
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer> ();
        int flag =0;
        for(int n=0;n<=arr.length-1;n++)
        {
            arr[n] = in.nextInt();
            list.add(arr[n]);
        }
        Collections.sort(list);
        for(int i=1;i<=arr.length+1;i++)
        {
            if(i== list.get(i-1))
                flag++;
            else
                System.out.println(i);
        }



    }
}

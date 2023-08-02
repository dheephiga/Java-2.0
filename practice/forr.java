import java.util.*;

public class forr{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int [] arr = new int [n];
		int [] b = new int[n];

		int count =0;
		for(int i = 0 ;i<n;i++)
			arr[i] = in.nextInt();

		for(int i = 0;i <n;i++)
		{
			for(int j = i;j>=0;j--)
			{
				if(arr[j] > arr[i])
					count++;
			}
			b[i] = count;
			count =0;
		}
		for(int i = 0;i<n;i++)
			System.out.print(b[i] + " ");

	}
}

//9 8 7 4 3 4 1
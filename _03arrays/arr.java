public class arr {
    public static void main(String [] args)
    {
        //Scanner in = new Scanner(System.in);
        //jagged array
        int [][] arr = new int [3][];
        arr[0] = new int[5];
        arr[1] = new int [4];
        arr[2]= new int [3];

        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j <arr[i].length;j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




    }
}

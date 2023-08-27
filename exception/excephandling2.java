public class excephandling2 {
    public static void main(String[] args) {
        int j =0;
            try{
                int i = 19/j;
                if(j==0)
                    throw new ArithmeticException("Cannot divide by zero");
            }

            catch(ArithmeticException e)
            {
                System.out.println(19/1);
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong");
            }
    }
}

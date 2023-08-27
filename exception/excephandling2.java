public class excephandling2 {
    public static void main(String[] args) {
            try{
                int i = 19/0;
                if(i==0)
                throw new ArithmeticException("Cannot divide by zero");
            }

            catch(ArithmeticException e)
            {

            }
    }
}

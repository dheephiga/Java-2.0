abstract  class abs{
    public abstract void abs_show();
   public abstract void abs_view();

}
public class abs_anon_inner {
    public static void main(String[] args) {
        abs ab = new abs() {
         public void abs_show()
         {
             System.out.println("Abstract method - show");
         }
         public void abs_view()
         {
             System.out.println("Abstract method - view");
         }
        };

        ab.abs_show();
        ab.abs_view();
    }
}

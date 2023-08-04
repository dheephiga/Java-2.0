import java.util.*;
class A{
    int a;
    void display()
    {
        System.out.println(this.a);
    }
}
class B extends A {
    int b;

    void display(int b) {
        this.b = b;
    }

    public class single_inheritance {
        public static void main(String[] args) {
            A acc = new A();
            B bcc = new B();
            acc.a = 10;
            bcc.a = 11;
            bcc.b = 12;
            acc.display();
            bcc.display();
        }
    }
}

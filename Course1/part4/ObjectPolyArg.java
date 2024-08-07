package Course1.part4;

import Course1.poly.*;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a=new A();
        display(a);
        B b=new B();
        display(b);
    }

    private static void display(Object obj) {
        if (obj instanceof A) {
            ((A)obj).printGo();
        }
        else {
            ((B)obj).printGo();
        }
    }
}

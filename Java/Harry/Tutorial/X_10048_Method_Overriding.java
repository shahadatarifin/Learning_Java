class A48{
    public void method() {
        System.out.println("This method is from class A");
    }
}

class B48 extends A48 {
    @Override                                                   // Not Important but recommended
    public void method (){
        System.out.println("This method is from class B");
    }
}

public class X_10048_Method_Overriding {
    public static void main(String[] args) {
        A48 a = new A48();
        a.method();

        B48 b = new B48();
        b.method();
    }
}

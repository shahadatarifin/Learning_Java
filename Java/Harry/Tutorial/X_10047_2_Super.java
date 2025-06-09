class Class1 {
    int a;

    Class1(int a) {
        this.a = a;
    }
}

class Class2 extends Class1{
    Class2(int x) {
        super(x);
        System.out.println("I am a constructor of class-2 ");
    }
}

public class X_10047_2_Super {
    public static void main(String[] args) {
        Class2 c1 = new Class2(10);
    }
}
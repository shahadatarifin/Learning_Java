class Base46{
    Base46(){
        System.out.println("I am a Base class constructor");
    }

    Base46(int a){
        System.out.println("I am a overloaded constructor with value of a as: " + a);
    }
}

class Derived46 extends Base46 {
    Derived46() {
//        super(0);
        System.out.println("I am a Derived class constructor");
    }

    Derived46(int a, int b) {
        super(a);
        System.out.println("I am an Overloaded constructor of Derived with value of b as: " + b);
    }
}

class ChildOfDerived extends Derived46 {
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int a, int b, int c){
        super(a, b);
        System.out.println("I am a an overloaded constructor of ChildOfDerived with value of c as: " + c);
    }
}


public class X_10046_Constructors_in_Inheritance {
    public static void main(String[] args) {

//        Base46 b = new Base46();

//        Base46 b1 = new Base46(69);

//        Derived46 d = new Derived46();

//        Derived46 d1 = new Derived46(1,2);

        ChildOfDerived cd = new ChildOfDerived(1, 2, 3);
    }
}
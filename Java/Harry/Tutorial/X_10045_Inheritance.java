class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in base");
        System.out.println("Setting X now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("Sout from base class");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class X_10045_Inheritance {
    public static void main(String[] args) {

        // Creating Object of base class
        Base b = new Base();
        b.setX(1);
        System.out.println(b.getX());


        // Creating Object of Derived class
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
    }
}

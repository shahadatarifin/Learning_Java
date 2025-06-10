class Phone{
    public void showTime(){
        System.out.println("The time is 9:00 am");
    }

    public void on(){
        System.out.println("Turning on Phone....");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music.......");
    }

    public void on(){
        System.out.println("Turning on Smart Phone....");
    }
}

public class X_10049_Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();           // Allowed
//        SmartPhone obj1 = new Phone();          // Not allowed

        obj.on();
//        obj.music();                            // Not allowed
        obj.showTime();
    }
}

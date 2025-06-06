public class Chapter_8 {
/*
1.  Create a class employee with following properties and methods
    Salary(property)(int)
    getSalary(method returning int)
    name(property)(String)
    getName(method returning String)
    setName(method changing name)

2.  Create a class cellphone with methods to print "ringing ...", "vibrating ...", etc

3.  Create a class squire with a method to initialize it's size, calculating area, perimeter etc
 */
}




// Solution 1
class Sol_8_1{
    static class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
    }

    public static void main(String[] args) {
        Employee shahadat = new Employee();
        shahadat.setName("Shahadat Arifin");
        shahadat.salary = 20;
        System.out.println(shahadat.getName());
        System.out.println(shahadat.getSalary());
    }
}




// Solution 2
class Sol_8_2{
    static class CellPhone{
        public void ring(){
            System.out.println("Ringing...");
        }

        public void vibrate(){
            System.out.println("Vigrating...");
        }
    }

    public static void main(String[] args) {
        CellPhone ArifinsIphone = new CellPhone();
        ArifinsIphone.ring();
        ArifinsIphone.vibrate();
    }
}




// Solution 3
class Sol_8_3{
    static class Square{
        int side;

        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}














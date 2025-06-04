public class X_10038_Class {

    static class Employee{
        int id;
        String name;
        public void printingDetail(){
            System.out.println("My ID is : "+ id);
            System.out.println("My name is : "+ name);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee shahadat = new Employee();     // Instantiating a new Employee Object
        shahadat.id = 14288;
        shahadat.name = "Shahadat Arifin";
        shahadat.printingDetail();

        System.out.println();

        Employee washy= new Employee();
        washy.id = 14300;
        washy.name = "Washy Zaman";
        washy.printingDetail();

    }
}

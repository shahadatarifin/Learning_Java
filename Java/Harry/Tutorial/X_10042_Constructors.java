class Employee42{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public Employee42(){                //
        id = 14288;                     // Constructor
        name = "My name";               //
    }

    public Employee42(int myId, String myName){         //
        this.id = myId;                                 // Constructor with arguments
        this.name = myName;                             //
    }

    public Employee42(int myId){
        this.id = myId;
    }

    public Employee42(String myName){
        this.name = myName;
    }
}

public class X_10042_Constructors {
    public static void main(String[] args) {
        Employee42 shahadat = new Employee42();
        System.out.println(shahadat.getId());
        System.out.println(shahadat.getName());

        Employee42 washy = new Employee42(14300, "Washy Zaman");
        System.out.println(washy.getId());
        System.out.println(washy.getName());
    }
}
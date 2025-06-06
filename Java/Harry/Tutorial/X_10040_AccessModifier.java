class Employee40 {
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class X_10040_AccessModifier {
    public static void main(String[] args) {
        Employee40 shahadat = new Employee40();
//        shahadat.id = 14288;
//        shahadat.name = "Shahadat Arifin";      --> Throw an error due to private access modifier;
        shahadat.setId(14288);
        shahadat.setName("Shahadat Arifin");
        System.out.println(shahadat.getId());
        System.out.println(shahadat.getName());
    }
}

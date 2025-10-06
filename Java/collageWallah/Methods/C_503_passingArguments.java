public class C_503_passingArguments {

    public static void greet (String name) {
        System.out.println("Good morning, " + name);
    }

    public static void sum (int a, int b) {
        System.out.println("sum = " + (a+b));
    }
    public static void main(String[] args) {
        greet("Arifin");
        sum(1, 2);
    }
}



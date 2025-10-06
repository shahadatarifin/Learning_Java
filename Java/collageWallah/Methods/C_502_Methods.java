public class C_502_Methods {
    public static void hello() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        hello();
        loop();
    }
    public static void loop() {
        for (int i = 1; i <= 10; i++ ) {
            System.out.print(i + " ");
        }
    }
}





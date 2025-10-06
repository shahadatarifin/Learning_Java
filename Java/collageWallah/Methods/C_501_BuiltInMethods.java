import java.util.Scanner;

public class C_501_BuiltInMethods {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.abs(-2));
        System.out.println(Math.floor(-3.14));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(1, 2));
    }
}


// Take 3 numbers as input and print the greatest of them using built-in method
class Sol_501_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 8, c = 1;
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
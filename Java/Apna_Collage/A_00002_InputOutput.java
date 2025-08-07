import java.util.Scanner;

public class A_00002_InputOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = s.nextInt();
        System.out.println("Sum : " + (a+b));
    }
}

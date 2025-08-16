import java.util.Scanner;

public class A_00003 {
}

class age {
    public static void main(String[] args) {
        System.out.print("Enter our age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}



class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


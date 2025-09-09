import java.util.Scanner;
public class C_302_breakStatement {
}

/*
Q1. WAP to find the highest factor of a number `n` (other than n itself)
Q2. WAP to find the number is prime or not
 */

class highestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n-1; i >= 1; i--) {
            if (n%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}


class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++){
            if (n%i == 0) {
                System.out.println("Composite Number");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Prime Number");
        }
    }
}

class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n%i == 0) {
                System.out.println("Composite Number");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Prime Number");
        }
    }
}
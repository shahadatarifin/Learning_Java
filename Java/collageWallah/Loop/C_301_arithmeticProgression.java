import java.util.Scanner;

/*
Q1. Display this arithmetic progression - 1,3,5,7...upto 'n' terms
Q2. Display this arithmetic progression - 4,7,10,13,16...upto 'n' terms
Q3. Display this geometric progression - 1,2,4,8,16,32...upto 'n' terms
An = A + (n - 1) d
An = ar^n-1
*/

public class C_301_arithmeticProgression {
}


class Sol_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 3*n - 1; i+=2) {
            System.out.println(i);
        }
    }
}

class Sol_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; i <= 3*n - 1; i += 3) {
            System.out.println(i);
        }
    }
}

class Sol_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;
        }
    }
}
import java.util.Scanner;

public class A_10007_FunctionsAndMethods {
}

// 1. Print a given name in a function
class Function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();

        printMyName(name);
    }
}

// 2. Make a functiuon to add 2 numbers and return the sum
class Sum{
    public static int sumTwoNum(int x, int y){
        return (x + y);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = s.nextInt();
        System.out.print("Enter Second Number: ");
        int b = s.nextInt();

        int c = sumTwoNum(a, b);
        System.out.println("Sum : " + c);
    }
}


// 4. Find the factorial of a number
class Factorial {
    public static int calculateFactorial(int n){
        if (n < 0){
            System.out.println("Invalid Number");
            return -1;
        } else if (n == 1 || n == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++){
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        System.out.print("Factorial of : ");
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();

        System.out.println("= " + calculateFactorial(f));
    }
}
/*
1. Write a java method to print multiple table of a number n

2. Write a program using function to print following pattern
    *
    * *
    * * *
    * * * *

3.  Write a recursive function to calculate sum of first n natural numbers;

4.  Write a program using function to print following pattern
    * * * *
    * * *
    * *
    *

5.  Write e program to print nth turm of fibonacci series using recursion

6.  Write a function to find average of a set of numbers passed as arguments

7.  Repeat 2 using recursion
8.  Repeat 4 using Recursion
 */

public class Chapter_7 {
}

// Solution 1
class Sol_7_1 {
    static void multiplication (int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d\tX\t%d\t=\t%d\n",n, i, i*n);
        }
    }
    public static void main(String[] args){
        multiplication(7);
    }
}



// Solution 2
class Sol_7_2{
    static void pattern(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}




// Solution 3
class Sol_7_3{
    static int sumN(int x){
        if (x == 0) {
            return 0;
        } else {
            return x + sumN(x - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural number : " + sumN(5));
    }
}




// Solution 4
class Sol_7_4{
    static void pattern(int x){
        for(int i = 1; i <= x; i++){
            for(int j = x; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}




// Solution 5
class Sol_7_5 {
    static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("nth term of Fibonacci series is : " + fibonacci(n));
    }
}





// Solution 6
class Sol_7_6{
    static double avg(int ...arr){
        if (arr.length == 0){
            return 0;
        } else {
            double sum = 0.0;
            for (int e : arr){
                sum += e;
            }
            return sum / arr.length;
        }
    }

    public static void main(String[] args){
        System.out.println("Average of 4 and 5 is: " + avg(4, 5));
        System.out.println("Average of 3, 4 and 5 is: " + avg(3, 4, 5));
        System.out.println("Average of 2, 3, 4 and 5 is: " + avg(2, 3, 4, 5));
    }
}




// Solution 7
class Sol_7_7{
    static void rec(int n){
        if (n >= 1){
            rec(n - 1);
            for (int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rec(5);
    }
}




// Solution 8
class Sol_7_8{
    static void rec(int n){
        if (n >= 1){
            for (int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();
            rec(n - 1);
        }
    }
    public static void main(String[] args) {
        rec(5);
    }
}
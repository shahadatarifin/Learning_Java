/*
1. Write a java method to print multiple table of a number n

2. Write a program using function to print following pattern
    *
    * *
    * * *
    * * * *
 */

import java.util.Scanner;
public class Chapter_7 {
}

// Solution 1
class Sol_1 {
    static void multiplication (int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d\tX\t%d\t=\t%d\n",n, i, i*n);
        }
    }
    public static void main(String[] args){
        multiplication(7);
    }
}



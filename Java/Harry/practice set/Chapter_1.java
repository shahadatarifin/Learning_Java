/*
1. Write a program to sum three numbers in java

2. Write a java program which asks the user to enter his/her name and greats them with "hello <name> have a good day" text

3. Write a java program to convert kilometers to miles

4. Write a java program to detect whether a number entered by the user is integer or not

 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Chapter_1 {
}

// Solution 1
class sol_1{
    public static void main(String[] args){
        int n1 = 1, n2 = 2, n3 = 3;
        int sum = n1 + n2 + n3;
        System.out.println(sum);
    }
}


// Solution 2
class Sol_2 {
    public static void main(String[] args){
        System.out.print("What is your name: ");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Have a great day");
    }
}


// Solution 3
class Sol_3 {
    public static void main(String[] args){
        System.out.print("kilometer -> ");

        Scanner s = new Scanner(System.in);
        double km = s.nextDouble();
        double mile = km * 0.621371;

        System.out.print("mile -> " + mile);
    }
}


// Solution 4
class Sol_4{
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner s = new Scanner(System.in);
        System.out.println(s.hasNextInt());
    }
}
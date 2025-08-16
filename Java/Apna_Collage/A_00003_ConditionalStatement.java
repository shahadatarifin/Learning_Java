import java.util.Scanner;

public class A_00003_ConditionalStatement {
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

class ifElseConditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b");
        int b = s.nextInt();

        if (a == b){
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
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

class switchCondition{
    public static void main(String[] args) {
        System.out.println("Press 1 for Good");
        System.out.println("Press 2 for Better");
        System.out.println("press 3 for Best");
        System.out.print("Choose : ");
        Scanner s = new Scanner(System.in);
        int button = s.nextInt();

        switch (button) {
            case 1:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Better");
                break;
            case 3:
                System.out.println("Best");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
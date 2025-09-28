public class C_305_Questions {
}

/*
Q1  WAP to print sum of digits of a given number
Q2  WAP to print product of digits of a given number
Q3  WAP to print reverse of a given number
Q4  Print the factorial of a given number
Q5  WAP to print all the ASCII values and their equivalent characters of alphabets using a while loop



 */

class Sol_305_1 {

    public static void main(String[] args) {
        int n = 125619;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n%10;
            sum += lastDigit;
            n/=10;
        }

        System.out.println(sum);
    }
}



class Sol_305_2 {
    public static void main(String[] args) {
        int n = 125619;
        int product = 1;

        while (n != 0) {
            int lastDigit = n%10;
            if (lastDigit != 0) {
                product *= lastDigit;
            }
            n /= 10;
        }

        System.out.println(product);
    }
}



class Sol_305_3 {
    public static void main(String[] args) {
        int n = 1625;
        int r = 0;

        while ( n != 0) {
            int lastDigit = n%10;
            r *= 10;
            r += lastDigit;
            n /= 10;
        }

        System.out.println(r);
    }
}


class Sol_305_4 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}

class Sol_305_5 {
    public static void main(String[] args) {
        int count = 1;
        int i = 65, j = 97;
        while (count <= 26) {
            System.out.println(count + "\t" + (char)i + " -> " + (char)j);
            i++;
            j++;
            count++;
        }
    }
}
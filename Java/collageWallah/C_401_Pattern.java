import java.util.Scanner;
public class C_401_Pattern {
}



//         *  *  *  *
//         *  *  *  *
//         *  *  *  *
class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter Numbewr of collums: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



//  A B C D E
//  A B C D E
//  A B C D E
//  A B C D E
//  A B C D E
class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}



//        *
//        *  *
//        *  *  *
//        *  *  *  *
class starTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
class numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



//  A
//  A B
//  A B C
//  A B C D
//  A B C D E
class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                System.out.print( (char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}



//  1
//  A B
//  1 2 3
//  A B C D
//  1 2 3 4 5
class alphanumericTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i%2 != 0) {
                for (int j = 1; j <= i; j++ ){
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= i; j++ ){
                    System.out.print( (char)(j+64) + " ");
                }
            }

            System.out.println();
        }
    }
}



//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *
class starTriangleUltra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



//        1
//        1 3
//        1 3 5
//        1 3 5 7
class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                System.out.print((2*j - 1) + " ");
            }
            System.out.println();
        }
    }
}


//        1
//        2	    3
//        4	    5	6
//        7	    8	9	10
//        11	12	13	14  15
class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
}

//
//         1
//         0  1
//         1  0  1
//         0  1  0  1
//         1  0  1  0  1

class binaryNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ){
                if (i%2 != 0) {
                    if (j%2 != 0) {
                        System.out.print(" 1 ");
                    } else {
                        System.out.print(" 0 ");
                    }
                } else {
                    if (j%2 == 0) {
                        System.out.print(" 1 ");
                    } else {
                        System.out.print(" 0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}



class StarPlus {}
class hollowRectangle{}
class starCross {}
class starTriangleReverse{}
class numberTriangleReverse{}
class rhombus{}
class starPyramid{}
class numberPyramid{}
class starDiamond{}


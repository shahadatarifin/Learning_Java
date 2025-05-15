public class X_10006_Pattern {
    /*
    1.  *
        *
        *
        *
        *

    2.  * * * * *
        * * * * *
        * * * * *
        * * * * *

    3.  * * * * *
        *       *
        *       *
        * * * * *

    4.  *
        * *
        * * *
        * * * *
        * * * * *

    5.  * * * * *
        * * * *
        * * *
        * *
        *

    6.       *
           * *
         * * *
       * * * *
     * * * * *

     7. 1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5


    8.  1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

    9.  1
        2  3
        4  5  6
        7  8  9  10
        11 12 13 14 15

    10. 1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

     */
}

class p_1{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("* ");
        }
    }
}

class p_2 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class p_3{
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        // outer loop
        for (int i = 0; i < y; i++){
            // inner loop
            for (int j = 0; j < x; j++){
                if (i == 0 || j == 0 || i == y-1 || j == x-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class p_4{
    public static void main(String[] args) {
        int x = 5;
        for(int i = 0; i < x; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class p_5 {
    public static void main(String[] args) {
        int x = 5;
        for(int i = x; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class p_6{
    public static void main(String[] args) {
        int x = 5;

        // outer loop
        for(int i = 1; i <= x; i++){
            // inner loop for printing space
            for(int j = 1; j <= x-i; j++){
                System.out.print("  ");
            }
            // inner loop for printing star
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class p_7{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class p_8{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class p_9{
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(x + "\t");
                x++;
            }
            System.out.println();
        }
    }
}

class p_10{
    public static void main(String[] args) {
        int n = 5;
        int x;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i+j;
                if (sum%2 != 0){
                    x = 0;
                }else{
                    x = 1;
                }
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
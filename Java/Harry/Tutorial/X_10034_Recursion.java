public class X_10034_Recursion {
    static int factorial_iterative(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++){
                f = f*i;
            }
            return f;
        }
    }

    static int factorial (int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The value of factorial 4 is -> " + factorial(1));
        System.out.println("The value of factorial 4 is -> " + factorial_iterative(1));
    }
}

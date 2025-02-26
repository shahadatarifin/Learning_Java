public class Sol_6 {
    public static void main(String[] args) {
        int n = 5;
        int f = 1;
        int i = 5;
        while (i >= 1){
            f *= i;
            i--;
        }
        System.out.println("Factorial of 5 is -> " + f);
    }
}

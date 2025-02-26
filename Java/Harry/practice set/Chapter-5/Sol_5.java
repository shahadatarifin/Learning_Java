
public class Sol_5 {
    public static void main(String[] args) {
        int n = 5;                              // 5 X 4 X 3 X 2 X 1
        int f = 1;
        for ( int i = 5; i >= 1; i--){
            f = f*i;
        }
        System.out.println("Factorial of 5 -> " + f);
    }
}

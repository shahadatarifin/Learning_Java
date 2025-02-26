public class Sol_2 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while ( i <= 5 ){
            sum = sum + (i*2);
            i++;
        }
        System.out.println("sum of first 5 numbers is -> " + sum);
    }
}
public class X_10024_2_Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 2) {
                continue;                   // continue -> skip
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
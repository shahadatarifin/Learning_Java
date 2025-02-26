public class X_10024_1_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2){
                System.out.println("Ending the loop");
                break;                                      // break -> exit from loop
            }
        }
    }
}

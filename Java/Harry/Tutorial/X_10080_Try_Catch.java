public class X_10080_Try_Catch {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("a/b -> " + c);
        } catch (Exception e){
            System.out.print("Failed\nReason -> ");
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}

public class X_10031_Method {

    static void tellJoke(){
        System.out.println("One joke, coming up! What is a sea monster’s favorite snack? Ships and dip.");
    }
    static int logic(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        int c = logic(a, b);
        System.out.println("largest number -> " + c);
        System.out.println("joke -> ");
        tellJoke();
    }
}

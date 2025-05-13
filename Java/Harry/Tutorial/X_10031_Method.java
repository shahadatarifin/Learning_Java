public class X_10031_Method {

    static int staticMethod(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    int instanceMethod(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }

    static void tellJoke(){
        System.out.println("One joke, coming up! What is a sea monster’s favorite snack? Ships and dip.");
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 44;
        int c1 = staticMethod(a, b);
        System.out.println("Largest number -> " + c1);

        X_10031_Method obj = new X_10031_Method();
        int c2 = obj.instanceMethod(a, b);
        System.out.println("Largest number -> " + c2);

        System.out.print("Joke -> ");
        tellJoke();
    }
}
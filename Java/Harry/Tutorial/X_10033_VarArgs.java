public class X_10033_VarArgs {
}

// Don't do this ->
class VarArgs_0 {

    static int sum_0 (int a, int b){
        return a+b;
    }

    static int sum_0 (int a, int b, int c){
        return a+b+c;
    }

    static int sum_0 (int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is: " + sum_0(4, 5));
        System.out.println("The sum of 3, 4 and 5 is: " + sum_0(3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum_0(2, 3, 4, 5));
    }
}



// Do this ->
class VarArgs{
    static int sum (int ...arr){
        // available as int [] arr;
        int result = 0;
        for (int el : arr){
            result += el;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum(2, 3, 4, 5));
    }
}
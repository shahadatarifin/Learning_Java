public class X_10032_1_Method {

    static void change1 (int x){
        x = 69;
    }

    static void change2 (int [] array){
        array[0] = 69;
    }

    public static void main(String[] args) {
        int a = 1;
        change1(a);
        System.out.println(a);

        int [] arr = {1, 2, 3, 4, 5};
        change2(arr);
        System.out.println(arr[0]);
    }
}

// In case of Array, the reference is passed. Same is the case for object passing to methods

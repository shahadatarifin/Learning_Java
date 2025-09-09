public class C_303_whileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        for (;j <= 10;) {
            System.out.println(j);
            j++;
        }
    }
}


// Q.1  WAP to count digits of a given number
class Sol_303_1{
    public static void main(String[] args) {
        int n = 1234321;
        int count = 0;
        while (n != 0) {
            n/= 10;
            count++;
        }
        System.out.println(count);
    }
}
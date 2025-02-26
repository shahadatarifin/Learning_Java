public class X_10027_Array {
    public static void main(String[] args) {

        int [] a1 = {1, 2, 3};                                      // Integer array

        float [] a2 = {1.1f, 2.2f, 3.3f};                           // Float array

        String [] a3 = {"Shahadat", "Arifin", "Onim"};              // String array

        System.out.println("Length of a1 -> ");                     // length
        System.out.print(a1.length);

        System.out.println(a1[1]);                                  // Displaying the arra
        System.out.println(a2[2]);
        System.out.println(a3[0]);

        for (int i = 0; i < a3.length; i++){                        // Displaying array with for loop
            System.out.println(a3[i]);
        }
    }
}

/*
1.  Create an array of 5 floats and calculate their sum

2.  Write a program to find out whether a given integer is present in an array or not

3.  Calculate the average marks from an array containing marks of all students in physics using 'for-each' loop

4.  Create a java program to add two Matrix of size 2X3

5.  Write a program to reverse an array

6.  Write a java program to find the maximum element in on array

7.  Write a java program to find whether an array is sorted or not


 */

public class Chapter_6 {
}


// Solution 1
class Sol_1 {
    public static void main(String[] args) {
        float [] array1 = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float sum1 = 0;
        for (int i = 0; i < array1.length; i++){
            sum1 += array1[i];
        }
        System.out.println(sum1);
    }
}


class Sol_2{
    public static void main(String[] args) {
        int [] array2 = {1, 2, 3, 4, 5, 6};

//        int n1 = 69;
        int n1 = 6;
        boolean isInArray = false;

        for ( int e : array2){
            if (n1 == e){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The given integer is present in the array");
        } else{
            System.out.println("The given integer is not present in the array");
        }
    }
}


class Sol_3{
    public static void main(String[] args) {
        float [] array3 = {89.0f, 87.0f, 88.5f, 91.0f, 93.5f};

        float sum3 = 0.0f;

        for ( float e : array3){
            sum3 += e;
        }
        float avg3 = sum3/array3.length;
        System.out.println("Average -> " + avg3);
    }
}

class Sol_4 {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] mat2 = {
                {9, 8, 7},
                {6, 5, 4}
        };
        int[][] result = new int[mat1.length][mat1[0].length];


        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }


        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// my
class Sol_5_1 {
    public static void main(String[] args) {
        int [] array5 = {1, 2, 3, 4, 5, 6};
        int [] array55 = new int[array5.length];
        int l = array5.length - 1;
        for (int i = 0; i < array5.length; i++){
            array55[l] = array5[i];
            l--;
        }
        for (int e : array55){
            System.out.print(e + " ");
        }
    }
}

class Sol_5_2 {
    public static void main(String[] args) {
        int[] array5_2 = {1, 2, 3, 4, 5, 6};

        int start = 0;
        int end = array5_2.length - 1;
        while (start < end) {
            int temp = array5_2[start];
            array5_2[start] = array5_2[end];
            array5_2[end] = temp;

            start++;
            end--;
        }
        for (int e : array5_2) {
            System.out.print(e + " ");
        }
    }
}

class Sol_6{
    public static void main(String[] args) {

        int [] array6 = {1, 3, 5, 64, 23, 12};
        int max6 = Integer.MIN_VALUE;

        for (int e : array6){
            if (e > max6){
                max6 = e;
            }
        }
        System.out.println("maximum value of the array is -> " + max6);
    }
}


class Sol_7{
    public static void main(String[] args) {
        int [] array7 = {1, 3, 32, 36, 56, 100};
        boolean isSorted = true;

        for (int i = 0; i < array7.length - 1; i++){
            if (array7[i] > array7[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}



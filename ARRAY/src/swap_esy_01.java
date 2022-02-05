// level - easy
// Question - swap any two values from array

import java.util.Arrays;
public class swap_esy_01 {

    // by using function
    static void swapp(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 16, 56, 89 };
        System.out.println("Before Swapping the array");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        // let we want to swap the value of index 1 and 4
        // int temp = arr[1];
        // arr[1] = arr[4];
        // arr[4] = temp;
        // {12,89,16,56,23}

        System.out.println("\nAfter Swapping the array");
        // for (int i : arr) {
        // System.out.print(" " + i);
        // }

        // To call function and give that index position which you want to change
        swapp(arr, 1, 3);
        // Another way to print (in one line)
        System.out.println(Arrays.toString(arr));
    }
}

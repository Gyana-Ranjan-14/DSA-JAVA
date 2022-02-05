// level - easy

import java.util.Arrays;

public class reverse_arr_esy_04 {

    // method -1
    // // by swap function
    // static void swapp(int[] arr, int index1, int index2) {
    //     int temp = arr[index1];
    //     arr[index1] = arr[index2];
    //     arr[index2] = temp;
    // }

    // // reverse function
    // static void reverse(int[] arr) {
    //     int stat = 0;
    //     int end = arr.length - 1;
    //     while (stat < end) {
    //         swapp(arr, stat, end);
    //         stat++;
    //         end--;
    //     }
    // }


    public static void main(String[] args) {
        int[] arr = { 12, 23, 16, 56, 10, 20, 33, 89, 67 };
        System.out.println("Before reversing the array");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        // reverse(arr); method -1

        // method -2
        // for (int i = 0; i < arr.length/2; i++) {
        //     int temp = arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i] = temp;
        // }
        System.out.println("\nAfter reversing the array");
        System.out.println(Arrays.toString(arr));
    }
}

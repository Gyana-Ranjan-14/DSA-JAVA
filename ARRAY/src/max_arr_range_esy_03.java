// level - easy
import java.util.Scanner;

// Q- find the maximum value in a range

public class max_arr_range_esy_03 {
    static void maxval(int[] arr, int start, int end) {
        int val = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (val <= arr[i]) {
                val = arr[i];
            }
        }
        System.out.println("The maximum number is : " + val);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 16, 56, 10, 20, 33, 89, 67 };
        int start, end;
        System.out.println("Enter the first value of the range : ");
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        System.out.println("Enter the end value of the range : ");
        end = sc.nextInt();
        maxval(arr, start, end);
        sc.close();
    }
}

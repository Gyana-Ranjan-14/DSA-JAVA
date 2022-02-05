import java.util.Scanner;

// you required to find the difference of two array and print the arr2-arr1 
//Assume - num a2 is greater

public class diff_arr_esy_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array 1 size ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the array 2 size ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter data ");
            arr2[i] = sc.nextInt();
        }
        int[] diff = new int[m];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            // when value comes -1
            int digit = 0;
            int val = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + carry >= val) {
                digit = arr2[j] + carry - val;
                carry = 0;
            } else {
                digit = arr2[j] + carry + 10 - val;
                carry = -1;
            }
            diff[k] = digit;

            i--;
            j--;
            k--;
        }
        // print (we dont want to print the 1st zeros)
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        // but when zero comes inside the diff
        while (idx < diff.length) {
            System.out.println("Ans is : " + diff[idx]);
            idx++;
        }
        sc.close();
    }
}

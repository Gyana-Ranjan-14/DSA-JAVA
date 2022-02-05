import java.util.Scanner;

public class sum_arr_esy_21 {
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
        // its size will according to the greater size of both arr
        int[] sum = new int[n > m ? n : m];
        int carry = 0;
        // we make this to the last of the element
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;// for sum 

        // when the sum gets 0 add the carry if available
        while (k >= 0) {
            int digit = carry;
            // if the i left now add it to digit
            if (i >= 0) {
                digit += arr1[i];
            }
            // if the j left now add it to digit
            if (j >= 0) {
                digit += arr2[j];
            }
            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }
        System.out.println("Output are");
        if (carry != 0) {
            System.out.println(" "+ carry);
        }
        // this will direct print the no not use the index
        for (int val : sum) {
            System.out.print(" "+ val);
        }
        sc.close();
    }
}

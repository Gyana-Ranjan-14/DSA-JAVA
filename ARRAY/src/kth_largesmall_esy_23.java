import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class kth_largesmall_esy_23 {
    public static void kthSmallest(Integer[] arr, int k) {
        Arrays.sort(arr);
        System.out.println("Kth Smallest array is : " + arr[k-1]);
    }
    public static void kthlarge(Integer[] arr, int k) {
        Arrays.sort(arr , Collections.reverseOrder());
        int i;
        for ( i = 0; i < k; i++) {
            
        }
        System.out.println("Kth large array is : " + arr[i-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of arr ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter k th value : ");
        int m = sc.nextInt();
        kthSmallest(arr,m);
        kthlarge(arr, m);
       sc.close();
    }
}

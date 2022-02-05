import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class large_3_elearr_esy_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arr size : ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Enter how many big elements You want : ");
        int max = sc.nextInt();
        System.out.println("The" + max + " Big Numbers are ");
        for (int i = 0; i < max; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}

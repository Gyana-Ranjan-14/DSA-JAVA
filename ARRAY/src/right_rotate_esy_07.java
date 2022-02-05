// level easy
import java.util.Scanner;

public class right_rotate_esy_07 {

    static void rightrotate(int arr[], int n, int d) {
        // condition if array size greater than rotation size
        while (d > n) {
            d = d - n;
        }

        // create temp arr of size n-d
        int temp[] = new int[n - d];
        
        for (int i = 0; i < n - d; i++) {
            temp[i] = arr[i];
        }

        // now move the rest element to zero index
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }

        // now copy all the element from temp arr to original arr
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter How Many elements want to insert : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before rotation");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter how many times want to rotate");
        int d = sc.nextInt();
        rightrotate(arr, n, d);
         // // another way to print is direct insert according to the index they need to insert after rotation
        // for (int i = 0; i < n; i++) {
        //     arr[(i+d)%n] = sc.nextInt(); 
        // }
        System.out.print("After rotating the array\n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

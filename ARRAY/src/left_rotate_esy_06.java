// level - easy
import java.util.Scanner;

// arr = {1,2,3,4,5,6} after left rotate 2 times ans = {3,4,5,6,1,2}

public class left_rotate_esy_06 {

    static void leftrotate(int arr[], int n, int d) {
        for (int i = 0; i < d; i++) {
            rotatetone(arr, n);
        }
    }

    static void rotatetone(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++)

            arr[i] = arr[i + 1];

        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter How Many elements want to insert : ");
        Scanner sc = new Scanner(System.in);
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
        // // another way to print is direct insert according to the index they need to insert after rotation
        // for (int i = 0; i < n; i++) {
        //     arr[(i+n-d)%n] = sc.nextInt(); 
        // }
        leftrotate(arr, n, d);
        System.out.print("After rotating the array\n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

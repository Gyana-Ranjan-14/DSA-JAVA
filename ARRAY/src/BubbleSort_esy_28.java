import java.util.Scanner;

public class BubbleSort_esy_28 {

    // By applying addaptive method we can make it faster
    void bubblesortaddaptive(int arr[], int n) {
        boolean issort = false;
        for (int pass = 0; pass < n - 1; pass++) {
            // System.out.printf("\nPass Number " + pass);
            issort = true;
            for (int comp = 0; comp < n - 1 - pass; comp++) {
                if (arr[comp] > arr[comp + 1]) {

                    int temp = arr[comp];
                    arr[comp] = arr[comp + 1];
                    arr[comp + 1] = temp;
                    issort = false;
                }
            }
            if (issort) {
                return;
            }
        }
    }

    void bubblesort(int arr[], int n) {
        for (int pass = 0; pass < n - 1; pass++) {
            // System.out.print("\nPass Number " + pass );
            for (int comp = 0; comp < n - 1 - pass; comp++) {
                if (arr[comp] > arr[comp + 1]) {

                    int temp = arr[comp];
                    arr[comp] = arr[comp + 1];
                    arr[comp + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : \n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        BubbleSort_esy_28 obj = new BubbleSort_esy_28();
        obj.bubblesort(arr, n);
        System.out.println("\nAfter Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // obj.bubblesortaddaptive(arr, n);
        // System.out.println("\nAfter Sorting The Array ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        sc.close();
    }
}

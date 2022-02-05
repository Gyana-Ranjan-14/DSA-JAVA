import java.util.Scanner;

public class first_last_occurance_medium_36 {
    static int firstoccurance(int arr[], int low, int high, int result, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                result = mid;
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    static int lastoccurance(int arr[], int low, int high, int result, int x) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                result = mid;
                low = mid + 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
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
        int low = 0;
        int high = n - 1;
        int result = -1;
        System.out.print("Enter the element want to search : ");
        int x = sc.nextInt();
        System.out.println(firstoccurance(arr, low, high, result, x));
        System.out.println(lastoccurance(arr, low, high, result, x));
        sc.close();
    }
}

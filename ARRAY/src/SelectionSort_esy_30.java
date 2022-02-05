import java.util.Scanner;

public class SelectionSort_esy_30 {
    static void Selectionsort(int arr[], int n) {
        int i, j, small;
        for (i = 0; i < n - 1; i++) { //run till the previous element of the array
            small = i;  //store the first value as the small value
            for (j = i + 1; j < n; j++) {  //run the loop from i+1 to last element
                if (arr[j] < arr[small]) { //check the element that comes is smaller than or not
                    small = j; //if condition true change the value of small

                    // swapping
                    int temp = arr[small];  //swap the both element
                    arr[small] = arr[i];
                    arr[i] = temp;
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
        Selectionsort(arr, n);
        System.out.println("\nAfter Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

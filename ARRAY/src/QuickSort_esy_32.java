import java.util.Scanner;

public class QuickSort_esy_32 {
    static void Quicksort(int arr[], int low, int high) {
        if (low < high) // when atleast 2 element present in arr
        {
            int pivort = Partion(arr, low, high); // assign the pivort element as define in the partion function
            Quicksort(arr, low, pivort - 1); // left part of the array
            Quicksort(arr, pivort + 1, high); // right part of the array
        }
    }

    static int Partion(int arr[], int low, int high) {
        int pivort = arr[low];
        int i = low;
        int j = high;
        while (i < j) { // till i smaller than j run the loop
            while (arr[i] <= pivort && i<=high-1) // run till not find grater than pivort
                i++;
                //Think we have arr which is sorted in desc order like arr={9.8.7.6.5.4.3.2.1} then. At the same time (arr[i]<=pivot) will give an error (IndexOutOfBoundException) because the pivot is the highest element in the given array. So we can resolve it in two ways: insert the Maximum integer at last manually, and the second is to correct the logic of the while loop as above.

            while (arr[j] > pivort && j>=low) // run till not find smaller than pivort
                j--;

            if (i < j) // when i cross over j change i and j
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j; // thi mean it returns pivort
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
        int size = arr.length;
        Quicksort(arr, 0, size - 1);
        System.out.println("\nAfter Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

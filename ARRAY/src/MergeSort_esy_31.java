import java.util.Scanner;

public class MergeSort_esy_31 {
    static void Mergesort(int arr[], int l, int r) {

        if (l < r) // this means there is more than 2 element present in the array
        {
            int mid = (l + r) / 2; //find the middle element of array
            Mergesort(arr, l, mid); // for lrft of array
            Mergesort(arr, mid + 1, r); // rightside of array
            Mergearr(arr, l, mid, r); // merge the two arrays
        }
    }

    static void Mergearr(int arr[], int l, int mid, int r) {
        int[] temp = new int[arr.length]; // store here temporarly the values
        int i = l; // left pointer
        int j = mid + 1; // right pointer arr
        int k = l; // this will count index of element

        while (i <= mid && j <= r) {  //when i is smaller than mid and 'j' is smaller than right element
            if (arr[i] < arr[j]) {  //comparing both left and and store in temp arr which smaller betn them
                temp[k] = arr[i];
                i++; //go forward
            } else {  //if j is smaller than i
                temp[k] = arr[j];
                j++;
            }
            k++; //increase the temp index
        }

        // when left arr got over
        if (i > mid) { //when i greater than mid (means over of left arr)
            while (j <= r) {  //(when j is smaller than r)  (this work is for main arr not for the sub array)
                temp[k] = arr[j]; //
                k++;
                j++;
            }
        }
        else { //when right of arr is totally get to over
            while (i <= mid) {
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
        // copying values
        for (k = l; k <= r; k++) {
            arr[k] = temp[k];
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

        Mergesort(arr, 0, arr.length - 1);
        System.out.println("\nAfter Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

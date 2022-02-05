

// q- how do you know is the array in ascending or descending (how to resolve it)



import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch_esy_27 {
   public static int binarysearch(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) { // till l is smaller than high
            int mid = (left + right) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else if (k < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    } 

    // find wheather array is sorted in ascending or descending
    // boolean isAsc;
    // if(arr[left]<arr[right])
    // {
    //     isAsc=true;
    // }
    // else
    // {
    //     isAsc=false;
    // }
    // if(isAsc)  //for ascending order
    // {
    //     if(target<arr[mid])
    //     {
    //         right=mid-1;
    //     }
    //     else
    //     {
    //         left=mid+1;
    //     }
    // }
    // else //for descending order
    // {
    //     if(target>arr[mid])
    //     {
    //         right=mid-1;
    //     }
    //     else
    //     {
    //         left=mid+1;
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : \n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter data : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Element To Found : ");
        int k = sc.nextInt();
        int search = binarysearch(arr, k);
        if (search == -1) {
            System.out.println("Element Not Found ");
        } else {
            System.out.println("Element found at index " + search);
        }
        sc.close();
    }
}

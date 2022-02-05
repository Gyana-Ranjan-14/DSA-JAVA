public class Search_in_rotate_arr_esy_35 {
    static int rotatearr(int arr[], int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            // if the leftside of arr sorted
            if (arr[low] <= arr[high]) {
                if (k >= arr[low] && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (k > arr[mid] && k <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 3, 5, 6, 8, 9 };
        int i;
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int k = 8;
        int result = rotatearr(arr, k);
        
        if(result==-1)
        {
            System.out.println("\nElement Not Found ");
        }
        else
        {
            System.out.println("\nElement Found at index " + result);
        }
    }
}

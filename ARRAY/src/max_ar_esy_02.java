// Find the maximum element from the array
// level - easy
public class max_ar_esy_02 {
    static void maxval(int[] arr) {
        int val = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (val <= arr[i]) {
                val = arr[i];
            }
        }
        System.out.println("The maximum number is : " + val);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 16, 56, 10 };
        maxval(arr);
    }
}

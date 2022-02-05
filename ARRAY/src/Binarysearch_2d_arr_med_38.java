// binary search work only on sorted array
public class Binarysearch_2d_arr_med_38 {

    static int search(int[][] arr, int n, int res) {
        int row = 0, column = arr[0].length - 1;
        while (row < n && column >= 0) {
            if (res == arr[row][column]) {
                System.out.print("n Found at " + row + " " + column);
                return 1;
            }
            else if(res<arr[row][column]) //when element is greater than the target element ignore it
            {
               column--;
            }
            else //when element is smaller move forward
            {
                row++;
            }
        }
        System.out.print("n Element not found");
        return 1; // if ( i==n || j== -1 )
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 10, 20, 30, 40 },
                { 50, 56, 67, 88 },
                { 45, 32, 12, 15 },
                { 34, 31, 46, 80 }
        };
        int find = 88;
        search(mat, 4, find);
    }
}

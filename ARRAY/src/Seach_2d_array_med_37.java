public class Seach_2d_array_med_37 {
    static int search(int[][] arr, int n, int res) {
        if (n == 0)
            return -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == res) {
                    System.out.print("Element found at (" + i + ", " + j + ")\n");
                    return 1;
                }
            }
        }
        System.out.print(" Element not found");
        return 0;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 10, 20, 30, 40 },
                { 50, 56, 67, 88 },
                { 45, 32, 12, 15 },
                { 34, 31, 46, 80 }
        };
        int find = 12;
        search(mat, 4, find);
    }
}

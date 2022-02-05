import java.util.Scanner;

public class Richest_Customer_esy_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : \n");
        int n = sc.nextInt();
        System.out.print("Enter size of col : \n");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("enter data : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(richcustomer(arr));
    }

    static int richcustomer(int[][] arr) {
        // row=customer
        // col=accounts
        int ans = Integer.MIN_VALUE;
        for (int customer = 0; customer < arr.length; customer++) {
            int max = 0;
            for (int accounts = 0; accounts < arr[customer].length; accounts++) {
                max=max+arr[customer][accounts];
            }
            if (max > ans) {
                ans=max;
            }
        }
        return ans;
    }
}

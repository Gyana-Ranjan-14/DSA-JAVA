// level - hard

import java.util.Scanner;
public class Arraymanupulation_hard_10 {

    static long arrayManipulation(int n, int[][] queries) {

        long outputArray[] = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            outputArray[a] += k;
            outputArray[b+1] -= k;
        }
        long max = getMax(outputArray);
        return max;
    }
     static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        System.out.println("Enter no of queries");
        int m = sc.nextInt();
        int queries[][] = new int[m][3];
        System.out.println("Enter the values of a , b and k for queries ");
        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
            queries[i][2] = sc.nextInt();
        }
        long max = arrayManipulation(n, queries);

        System.out.println("The maximum no is : ");
        System.out.println(max);
        sc.close();
    }
}

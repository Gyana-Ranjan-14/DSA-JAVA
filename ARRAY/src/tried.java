
// Java Program to find Non
// empty subset such that
// its elements' sum is
// divisible by N
// import java.io.*;
import java.util.HashMap;
// import java.util.Map.Entry;
// import java.util.Map;
// import java.lang.*;
import java.util.Scanner;

class tried {

    // Function to print the
    // subset index and size
    static void findNonEmptySubset(int arr[],
            int N) {

        // Hash Map to store the
        // indices of residue upon
        // taking modulo N of prefixSum
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            // Calculating the
            // residue of prefixSum
            sum = (sum + arr[i]) % N;

            // If the pre[i]%n==0
            if (sum == 0) {
                // print size
                System.out.print(i + 1 + "\n");

                // Print the first i indices
                for (int j = 0; j <= i; j++)
                    System.out.print(j + 1 + " ");
                return;
            }

            // If this sum was seen
            // earlier, then the
            // contiguous subsegment
            // has been found
            if (mp.containsKey(sum) == true) {
                // Print the size of subset
                System.out.println((i -
                        mp.get(sum)));

                // Print the indices of
                // contiguous subset
                for (int j = mp.get(sum) + 1; j <= i; j++)
                    System.out.print(j + 1 + " ");

                return;
            } else
                mp.put(sum, i);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no of test cases ");
        int t = sc.nextInt();
        System.out.println("Enter The size of 1st arr");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter The size of 2nd arr");
        int M = sc.nextInt();
        int[] arr1 = new int[M];
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print("Enter data for 1st arr ");
                arr[i] = sc.nextInt();
            }
            for (int l = 0; l < M; l++) {
                System.out.print("Enter data for 2nd arr ");
                arr1[l] = sc.nextInt();
            }
        }

        // System.out.println("\nREsult of 1st arr");
        // findNonEmptySubset(arr, N);
        System.out.println("\nREsult of 2nd arr");
        findNonEmptySubset(arr1, M);
        sc.close();
    }
}

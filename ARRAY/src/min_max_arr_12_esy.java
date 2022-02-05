import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class min_max_arr_12_esy {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            int j = sc.nextInt();
            ar.add(j);
        }
        // process -1 using frame work
        // Collections.sort(ar); //it will by default sort lower to higher 
        // System.out.println("Minimum no is : " + ar.get(0));
        // System.out.println("Maximum no is : " + ar.get(n-1));

        // process - 2
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max < ar.get(i))  // for min max >ar.get(i)
            {
                max=ar.get(i);
            }
        }
        System.out.println("Maximum no is  : " + max);
        sc.close();
    }
}

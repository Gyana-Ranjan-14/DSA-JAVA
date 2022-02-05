import java.util.Scanner;

public class large_subarray_sum_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter data ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum=sum+arr[j];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
            }
        }
        System.out.println("Maximum subarray sum is : " + maxsum);
        sc.close();
    }
}

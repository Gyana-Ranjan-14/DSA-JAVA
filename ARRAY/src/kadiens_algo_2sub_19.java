import java.util.Scanner;

public class kadiens_algo_2sub_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter data ");
            arr[i]=sc.nextInt();
        }
        int cuurentsum=0;
        int maxsum=0;
        for (int i = 0; i < n; i++) {
            cuurentsum=cuurentsum+arr[i];
            if(cuurentsum>maxsum)
            {
                maxsum=cuurentsum;
            }
            // if the number is negative make it zero
            if(cuurentsum<0)
            {
                cuurentsum=0;
            }
        }
        System.out.println("Max sum is : " + maxsum);
        sc.close();
    }
}

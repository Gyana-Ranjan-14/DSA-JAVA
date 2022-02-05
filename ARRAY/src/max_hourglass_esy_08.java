// level -easy

import java.util.*;
public class max_hourglass_esy_08 {

    public static int hourglass(int arr[][])
    {
        int maxhourglass = Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                if(maxhourglass < sum)
                {
                    maxhourglass = sum;
                }
            }
        }
        
        return maxhourglass;
         
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        System.out.println("Enter the array data below of 6 * 6");
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int res = hourglass(arr);
        System.out.println("Maximum hourglass is : ");
        System.out.println(res + " ");
        sc.close();
    }
}


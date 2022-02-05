import java.util.Scanner;

public class Linearsearch_esy_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : \n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter data : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element To Found : ");
        int k = sc.nextInt();
        boolean flag = false;
        int i;
        sc.close();
        for (i = 0; i < n; i++) {
            if (arr[i] == k) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Element " + k + " is found at index no " + i);
        }
        else
        {
            System.out.println("Element is not found ");
        }
    }
}

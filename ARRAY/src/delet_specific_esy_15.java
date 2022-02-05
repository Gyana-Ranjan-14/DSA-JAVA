import java.util.Scanner;

public class delet_specific_esy_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before deleting elements are ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the index no want to delet");
        int index = sc.nextInt();
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After inserting elements are ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

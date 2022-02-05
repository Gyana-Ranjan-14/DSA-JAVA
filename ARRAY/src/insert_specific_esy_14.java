import java.util.Scanner;

public class insert_specific_esy_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before inserting elements are ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element want to insert ");
        int ele = sc.nextInt();
        System.out.println("Enter the index no ");
        int index = sc.nextInt();
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = ele;
        System.out.println("After inserting elements are ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

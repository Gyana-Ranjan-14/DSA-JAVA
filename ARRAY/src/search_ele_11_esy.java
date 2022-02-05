import java.util.Scanner;

// search element in array if find then write found with its index no
public class search_ele_11_esy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search ");
        int search = sc.nextInt();
        boolean flag=false;
        sc.close();
        int i;
        for (i = 0; i < n; i++) {
            if(search==arr[i])
            {
                flag=true;
                break;
                
            }
        }
        if(flag)
        {
            System.out.println("Element found at index no " + i);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
// use arraylist .contains to check wheather the element present or not

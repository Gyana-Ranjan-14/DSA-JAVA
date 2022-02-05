import java.util.Scanner;

public class InsertionSort_esy_29 {

    static void Insertionsort(int arr[],int n)
    {
       for (int i = 0; i < n; i++) {
           int temp = arr[i]; //store the 1st unsortvalue value in the temp value
           int j=i-1; //here j is the previous value of unsortvalue
           while(j>=0 && arr[j]>temp) //run till the pev value greater than temp
           {
              arr[j+1]=arr[j]; //move one step forward
              j--; //decrease to left of arr
           }
           arr[j+1]=temp; //store the value in the free place
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : \n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        Insertionsort(arr, n);
        System.out.println("\nAfter Sorting The Array ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

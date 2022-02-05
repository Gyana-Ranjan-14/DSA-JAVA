import java.util.Scanner;

// Q- you have given a set of array you have to print majority element of the array

//majority_element - the element that is present more than n/2 times 

//lot of ways to do this first here we go for bruit force in the next progeam-17 we will go for the most famous algorithim that is (Boyer-moore majority vote algo)

public class majority_element_esy_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int index = -1;
        System.out.print("Enter the array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data ");
            arr[i]=sc.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        // if found then print the element
        if (max > n / 2) {
            System.out.println("Ans is = " + arr[index]);
        } else {
            System.out.println("No Element found");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Find_evendigit_esy_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : \n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter data : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(findnumers(arr));
        sc.close();
    }

    static int findnumers(int nums[]) {
        // for count how many digts are even
        int count = 0;
        for (int num : nums) {
            if (even(num)) // if the num even increase the num
            {
                count++;
            }
        }
        return count;
    }

    // function that will find that is even or not
    static boolean even(int number) {
        int noofdigit = digit(number);
        if (noofdigit % 2 == 0) // the num return from digit is that even or odd check here
        {
            return true;
        }
        return false;
    }

    // function to check how many digits in the number
    static int digit(int number) {
        int count = 0;
        if (number < 0) {
            number = number * -1; // when the num less than 0 make it positive
        }
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            count++;
            number = number / 10; // for counting how many digits in number
        }
        return count;
    }
}

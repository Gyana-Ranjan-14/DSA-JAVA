// level - easy
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// reverse the array using array list

public class reverse_2_arr_esy_05
{
   public static void main(String[] args) {
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter How many element want to enter : ");
       n=sc.nextInt();
       ArrayList<Integer> li = new ArrayList<>();
       for (int i = 0; i < n; i++) {
           System.out.print("Enter data : ");
           int j= sc.nextInt();
           li.add(j);
       }
       System.out.println("Before reversing the array : ");
       for (int i = 0; i < n; i++) {
           System.out.print(li.get(i) + " ");
       }
       System.out.println("\nAfter reversing the array : ");
       Collections.reverse(li);

    //    System.out.println(li); - another way to print
       for (int i = 0; i < n; i++) {
           System.out.print(li.get(i) + " ");
       }
       sc.close();
   }
}
import java.util.Scanner;

public class search_str_esy_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str = sc.next();
        System.out.print("Enter index no of char to find ");
        char find = sc.next().charAt(0);
        boolean flag=false;
        for (int i = 0; i < str.length(); i++) {
            if(find==str.charAt(i))
            { 
               flag=true;
               break;
            }
        }
        if(flag)
        {
            System.out.println("Character found");
        }
        else
            {
                System.out.println("Not Found");
            }
        sc.close();
    }
}

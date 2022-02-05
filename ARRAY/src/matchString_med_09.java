// level - medium

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class matchString_med_09 {
    static int[] matchstring(String[] strings, String[] queries) {
        Map<String, Integer> map = new HashMap<>();

        int res[] = new int[queries.length];

        for (int i = 0; i < strings.length; i++) {
            String inputstring = strings[i];
            if (map.containsKey(inputstring)) {
                map.put(inputstring, map.get(inputstring) + 1);
            } else {
                map.put(inputstring, 1);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            String querystring = queries[i];
            if (map.containsKey(querystring)) {
                res[i] = map.get(querystring);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many strings want to enter :  ");
        int noOfStrings = sc.nextInt();
        String str[] = new String[noOfStrings];
        System.out.println("Enter Strings : ");
        for (int i = 0; i < noOfStrings; i++) {
            str[i] = sc.next();
        }

        System.out.print("Enter the strings want to match :  ");
        int queries = sc.nextInt();
        String strQ[] = new String[queries];

        for (int i = 0; i < queries; i++) {
            strQ[i] = sc.next();
        }
        int[] counter = matchstring(str, strQ);
        System.out.println(Arrays.toString(counter));
        sc.close();
    }
}

//Another approach 
/* 
      int[] arr = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count =0;
            for(int j=0;j<strings.length;j++)
            {
                if(queries[i].equal(string[j]))
                {
                    count++;
                }
            }
            arr[i]=count
        }
        return arr;
*/
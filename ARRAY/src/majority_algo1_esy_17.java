
// time - O(n) space - O(1)

public class majority_algo1_esy_17 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int count = 1;
        int ansindex = 0;
        int size = arr.length;
        int i;
        for (i = 1; i < size; i++) {
            if (arr[i] == arr[ansindex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ansindex = i;
                count = 1;
            }
            if (arr[i] == ansindex) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("Ans is " + arr[ansindex]);
        } else {
            System.out.println("No element found");
        }

    }
}

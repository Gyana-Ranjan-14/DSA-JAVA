// q- find the key element in the infinite sorted array
public class Ele_infinite_sortar_esy_33 {
    static int infinitesearch(int arr[],int key)
    {
        int low=0;
        int high=1;
        while(key>arr[high]) //when key is greater than high value
        {
           low=high; //high value make low 
           high=high*2; //make high value * 2
        }
        return binarysearch(arr, key, low, high);
    }
    static int binarysearch(int arr[],int key,int low,int high)
    { 
       while(low<=high)
       {
           int mid = (low+high)/2;
           if(key==arr[mid])
           {
               return mid;
           }
           else if(key>arr[mid])
           {
               low=mid+1;
           }
           else if(key<arr[mid])
           {
              high=mid-1;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,12,15,17,18,19,21,23,24,25,29,31,32,35}; //this is just ex-arr but actually its an infinite 
        int k=15;
        int search = infinitesearch(arr, k);
        if(search==-1)
        {
            System.out.println("Element Not Found ");
        }
        else
        {
            System.out.println("Element found at index " + search);
        }
    }
}

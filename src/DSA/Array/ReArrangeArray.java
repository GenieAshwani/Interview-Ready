package DSA.Array;

import java.util.Arrays;

public class ReArrangeArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rearrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int arr[], int n){

        // Your code here
        int min=0;
        int max=n-1;
        int Max=arr[n-1]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max]%Max)*Max;
                max--;
            }
            else{
                arr[i]=arr[i]+(arr[min]%Max)*Max;
                min++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/Max;
        }
    }
}

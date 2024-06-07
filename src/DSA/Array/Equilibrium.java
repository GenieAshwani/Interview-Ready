package DSA.Array;

public class Equilibrium  {

    public static void main(String[] args) {

        long arr[]={8,8,3,7,8,2,7,2};
        int i = equilibriumPoint(arr, arr.length);
        System.out.println(i);
    }

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        long cs=0;

        long rs=0;

        for(int i=0;i<arr.length;i++)
        {
            rs=sum-cs-arr[i];
            if(rs==cs) return i+1;
            cs+=arr[i];
        }

        return -1;

    }
}

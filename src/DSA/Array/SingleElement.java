package DSA.Array;

public class SingleElement {

    public static void main(String[] args) {

        int arr[]={4,1,2,1,2};
        int res =singleNumber(arr);
        System.out.println(res);
    }

    public static int singleNumber(int[] arr) {
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    }

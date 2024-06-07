package DSA.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmall {
    public static void main(String[] args) {
        int arr[]={7 ,10, 4, 3, 20, 15};

        kthSmallest(arr,3);
    }

    public static void kthSmallest(int arr[],int k)
    {
        PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {

                 prq.add(arr[i]);
                if(prq.size()>k)
                {
                    prq.remove();
                }

        }
        System.out.println(prq);
        System.out.println(prq.peek());
    }
}

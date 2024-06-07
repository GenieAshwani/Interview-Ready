package DSA.Array;

public class SetMisMatch {
    public static void main(String[] args) {
        int arr[]={2,2};

        int res[]=findErrorNums(arr);
    }

    public static int[] findErrorNums(int[] nums) {

        int n=nums.length;
        int dup=-1;
        int mis=-1;

        for(int i=0;i<n;i++)
        {
            if(nums[Math.abs(nums[i])-1]<0)
            {
                dup=Math.abs(nums[i]);
            }
            else{
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                mis=i+1;
                break;
            }
        }

        return new int[]{dup,mis};
    }
}


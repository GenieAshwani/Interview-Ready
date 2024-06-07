package DSA.String;

public class LargestOddNumber {
    public static void main(String[] args) {
        String s="35427";
        System.out.println(largestNum(s));
    }

    public static String largestNum(String num)
    {
        int length = num.length();
        for(int i=length-1;i>=0;i--)
        {
            if((num.charAt(i)-'0')%2!=0)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
    }


}

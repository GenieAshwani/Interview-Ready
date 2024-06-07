package DSA.String;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String S="i.like.this.program.very.much";
        reverseString(S);
        reverseWord(S);
    }
    public static void reverseWord(String s)
    {
        String k="";
        String arr[] = s.split("\\.");
        for(int i = arr.length-1 ;i>=0;i --){
            if(i>0){
                k = k + arr[i] + ".";
            }else{
                k=k+arr[i];
            }
        }

        System.out.println(k);
    }

    public static void reverseString(String s)
    {
        String s1="";
        for(char c:s.toCharArray()){
            s1=c+s1;
        }

        System.out.println(s1);
    }

}

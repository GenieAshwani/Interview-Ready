package DSA.String;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {


    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = generateSubsequences(input);
        List<String> subsequencesRec = generateSubsequencesRec(input);
        System.out.println("Subsequences of " + input + ": " + subsequences);
        System.out.println("Subsequences of " + input + ": " + subsequencesRec);
    }

    public static List<String> generateSubsequences(String s) {
        List<String> subsequences = new ArrayList<>();
        subsequences.add("");

        for (char c : s.toCharArray()) {
            List<String> newSubsequences = new ArrayList<>(subsequences);
            for (String subsequence : subsequences) {
                newSubsequences.add(subsequence + c);
            }

            subsequences = newSubsequences;
        }

        return subsequences;
    }

    public static  List<String> generateSubsequencesRec(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);
        List<String> rr = generateSubsequencesRec(ros);
        ArrayList<String> my=new ArrayList<>();

        for (int i=0;i<rr.size();i++)
        {
            my.add(rr.get(i));
            my.add(ch+rr.get(i));
        }
        return my;

    }
}
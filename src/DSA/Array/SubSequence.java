package DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {

        System.out.println(subSeq("abc"));
    }

    public static ArrayList<String> subSeq(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char cc=s.charAt(0);
        String ros=s.substring(1);
        ArrayList<String> myres=new ArrayList<>();
        ArrayList<String> rr=subSeq(ros);
        for(int i=0;i<rr.size();i++)
        {
            myres.add(rr.get(i));
            myres.add(cc+rr.get(i));
        }
        return myres;
    }
}

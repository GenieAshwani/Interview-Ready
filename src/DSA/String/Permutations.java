package DSA.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations of " + input + ": " + permutations);

        List<String> permutationsRec = generatePermutationsRec(input);
        System.out.println("Recursions Permutations of " + input+": " + permutationsRec);
    }

    public static List<String> generatePermutations(String s) {

        Set<String> resultSet = new HashSet<>();
        resultSet.add(""); // Add an empty permutation

        for (char c : s.toCharArray()) {
            Set<String> newPermutations = new HashSet<>();
            for (String permutation : resultSet) {
                for (int i = 0; i <= permutation.length(); i++) {
                    newPermutations.add(permutation.substring(0, i) + c + permutation.substring(i));
                }
            }
            resultSet = newPermutations; // Update permutations with new set of unique permutations
        }

        return new ArrayList<>(resultSet);
    }


    public static List<String> generatePermutationsRec(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);

        List<String> rr = generatePermutationsRec(ros);
        ArrayList<String> mr=new ArrayList<>();

        for(String res : rr)
        {
            for(int i=0;i<=res.length();i++)
            {
                String val=res.substring(0,i)+ch+res.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }

}


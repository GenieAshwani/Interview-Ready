package DSA.String;

import java.util.*;

public class SortByFreq {
    public static void main(String[] args) {
        String s="cccaaaa";
        System.out.println(sortByFreq(s));
    }

    public static String sortByFreq(String s)
    {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(entryList, (a, b) -> b.getValue() - a.getValue());

        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sortedString.append(c);
            }
        }
        return sortedString.toString();
    }
}

package DSA.Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountAnagram {

    public static void main(String[] args) {

        String txt="forxxorfxdofr";
        String pat="for";
        int res= search(pat,txt);
        System.out.println(res);
    }
    public static int  search(String pat, String txt) {
        // code here
        int ans = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int k = pat.length();

        Map<Character, Integer> map = new HashMap<>();

        for (int idx = 0; idx < k; idx++) {
            char c = pat.charAt(idx);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        count = map.size();

        while (j < txt.length())
        {
            char c = txt.charAt(j);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) == 0) {
                count--;
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

//ans
                if (count == 0) {
                    ans++;
                }

                if (map.containsKey(txt.charAt(i))) {
                    if (map.get(txt.charAt(i)) == 0) {
                        count++;
                    }
                    map.put(txt.charAt(i), map.getOrDefault(txt.charAt(i), 0) + 1);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}



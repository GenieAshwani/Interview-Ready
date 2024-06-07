package DSA.String;

public class Comprassion {

    public static void main(String[] args) {
        String s="aabbccc";
        int compassion = doCompression(s);
        System.out.println(compassion);
    }

    public static int doCompression(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int count = 0;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            if (count != 0) {
                s1 += s.charAt(i) + "" + count;
                // Move i to the next character after the sequence
                i = j - 1;
            }
        }
        System.out.println(s1);
        return s1.length();
    }


    public static int comprassion(String s)
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else {
                sb.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        System.out.println(sb);
        return count;
    }

}

package DSA.String;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindromeDp(s));
    }

    public static String longestPalindromeDp(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static String longestPalindrome(String s) {
        int n=s.length();
        int maxLen=Integer.MIN_VALUE;
        int sp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(solve(s,i,j)==true)
                {
                    if(j-i+1>maxLen)
                    {
                        maxLen=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxLen);
    }

    static boolean solve(String s,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)==s.charAt(j))
        {
            return solve(s,i+1,j-1);
        }
        return false;
    }


}

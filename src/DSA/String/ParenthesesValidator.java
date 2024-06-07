package DSA.String;

public class ParenthesesValidator {
    public static void main(String[] args) {
        String str = "((()))";
        System.out.println("Is the string valid? " + isValid(str)); // Output: true

        String str2 = "(()))";
        System.out.println("Is the string valid? " + isValid(str2)); // Output: false
    }

    private static boolean isValid(String sa)
    {
        int res=0;
       for(char c: sa.toCharArray())
       {
           if(c=='(') res++;
           else if(c==')') {
               res--;
            if (res<0)
            {
                return false;
            }
           }

       }
       return true;

    }

}

package DSA.String;

import java.util.Stack;

public class OuterMostParentheses {
    public static void main(String[] args) {
        String s="(()())(())";
        String parentheses = removeOuterParentheses2(s);
        System.out.println(parentheses);
    }

    public static String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')') count--;
            if(count!=0) ans.append(s.charAt(i));
            if(s.charAt(i)=='(') count++;
        }
        return ans.toString();
    }
    public static String removeOuterParentheses2(String s) {

        Stack<Character> stack=new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {


            if(s.charAt(i)==')')
            {
                stack.pop();
            }
            if(!stack.isEmpty()) ans.append(s.charAt(i));
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }


        }
        return ans.toString();
    }
}

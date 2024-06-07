package DSA.String;

import java.util.Stack;

public class ValidString {

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println("Is the string valid? " + isValid(str)); // Output: true

        String str2 = "{[()]";
        System.out.println("Is the string valid? " + isValid(str2)); // Output: false
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else if(c==')' && !s.isEmpty() && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(c=='}' && !s.isEmpty() && stack.peek()=='{')
            {
                stack.pop();
            }
            else if(c==']' && !s.isEmpty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

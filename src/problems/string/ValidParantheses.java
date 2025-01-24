package problems.string;

import java.util.Stack;

/**
 * @author ashiq
 * @createdOn 24/01/25 7:12 pm
 * @project JavaPlaygroud
 **/
public class ValidParantheses
{

    public static void main(String[] args)
    {
        System.out.println("() : "+isValid("()"));
        System.out.println("()[]{} : "+isValid("()[]{}"));
        System.out.println("([)] : "+isValid("([)]"));
        System.out.println("(( : "+isValid("(("));
        System.out.println("(){}}{ : "+isValid("(){}}{"));


    }

    public static boolean isValid(String s)
    {
        if(s.length()%2!=0)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();
        for(char c : charArray)
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else {
                if(stack.isEmpty())
                    return false;
                Character pop = stack.pop();
                if(c==')' && pop=='(')
                   continue;
                if(c=='}' && pop=='{')
                    continue;
                if(c==']' && pop=='[')
                  continue;
                return false;
            }
        }
        if(!stack.isEmpty())
            return false;


        return true;
    }
}

package Stack.leetcode;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isParenthesisMatching(String str)
    {
        Stack<Character>s= new Stack<>();
       for(char c:str.toCharArray())
       {
           if(c=='('|| c=='{'|| c=='[')
           {
               s.push(c);
           }
           else {
               if(s.isEmpty())
               {
                   return false;
               }
               if(c==')'&& s.peek()!='(')
               {
                 return  false;
               }
               if(c==']'&& s.peek()!='[')
               {
                   return false;
               }
               if(c=='}'&&s.peek()!='{')
               {
                   return false;
               }
               s.pop();
           }
       }
       return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(}";
        System.out.println(isParenthesisMatching(s));
    }



}

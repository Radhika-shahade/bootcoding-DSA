package Stack.leetcode;

import java.util.Stack;

public class ValidParenthesis2 {

    public static boolean isValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (isOpening(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!isMatching(stack.peek(), c)) {
                    return false;
                } else {
                    stack.pop();
                }

            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');

    }

    public static void main(String[] args) {
        String s = "({)}";
        System.out.println(isValidParenthesis(s));

    }


}

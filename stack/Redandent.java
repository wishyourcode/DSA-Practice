package stack;

import java.util.Stack;

/*
Given valid mathematical expressions in the form of a string. You are supposed to return true if the given expression contains a pair of redundant brackets, else return false. The given string only contains ‘(‘, ’)’, ‘+’, ‘-’, ‘*’, ‘/’ and lowercase English letters.

Note :
A pair of brackets is said to be redundant when a subexpression is surrounded by needless/ useless brackets.

For Example :
((a+b)) has a pair of redundant brackets. The pair of brackets on the first and last index is needless. 
While (a + (b*c)) does not have any pair of redundant brackets.  */
public class Redandent {
    public static boolean findRedundantBrackets(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                boolean hasOperator = false;

                // Pop until '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                // Pop the opening bracket '('
                stack.pop();

                // If no operator was found, brackets are redundant
                if (!hasOperator) {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }

        return false; // No redundant brackets found
    }

    public static void main(String[] args) {
        String expression1 = "((a+b))";
        String expression2 = "(a+(b*c))";

        System.out.println(findRedundantBrackets(expression1)); // Output: true
        System.out.println(findRedundantBrackets(expression2)); // Output: false
    }

}

// https://leetcode.com/problems/make-the-string-great/description/?envType=problem-list-v2&envId=2yoer6e7

import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}


// Here are my pseudo code/algorithms steps
// -edge case if only one items in s string return s
// - iterate through the string
// - create stringbuilder or hashmap
// - store the first letter and compare with the second letter
//   - if both are lower case ignore
//   - if lower and upper and of the same letter cancel out each other
// - return stored string

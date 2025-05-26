// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/?envType=problem-list-v2&envId=2yoer6e7

import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i= 0; i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            }
            else{
               st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}

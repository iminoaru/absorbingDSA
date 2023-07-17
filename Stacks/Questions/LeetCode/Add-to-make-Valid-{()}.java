https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){ // iterates over every character of the string 's'
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }      
        } 
        return stack.size(); // number of parentheses left in stack are the number of parantheses that are not closed.
    }
}

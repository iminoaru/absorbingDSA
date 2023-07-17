https://leetcode.com/problems/valid-parentheses/submissions/996514475/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){ // iterates over every character of the string 's'
            if(ch == '(' || ch == '[' || ch == '{'){ 
                stack.push(ch);
            }

            else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                }

                if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
                
                if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }
            }      
        } 
        return stack.isEmpty(); // this cant just be true because if there is only one character in the string 's' 
        //lets say '{' , then it will exit the for loop and just return true;
    }
}

  

class Solution {
    public boolean isValid(String s) {
        Stack<Character> validStack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                validStack.push(ch);
            }

            else if(ch == ')') {
                if(validStack.empty() || validStack.peek() != '(') {
                    return false;
                }
                validStack.pop();
                }
             else if(ch == '}') {
                if(validStack.empty() || validStack.peek() != '{') {
                    return false;
                
                }
                validStack.pop();
                }
             else if(ch == ']') {
                if(validStack.empty() || validStack.peek() != '[') {
                    return false;
                
                }
                validStack.pop();
        }
       
    }
    return validStack.empty();
}
}
